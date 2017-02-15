package ru.hardhill.hospclient;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import ru.hardhill.hubservice.CFTArrayOfSpesiality;
import ru.hardhill.hubservice.CFTBasicHttpBinding_IHubService;
import ru.hardhill.hubservice.CFTCheckPatientResult;
import ru.hardhill.hubservice.CFTGetSpesialityListResult;
import ru.hardhill.hubservice.CFTPatient;
import ru.hardhill.util.MyUtil;


public class MainActivity extends AppCompatActivity {

    final static String URI = "http://92.124.194.86:8686/hubservice";
    final static String TEMPURI = "http://tempuri.org/";
    private static final String SOAP_ACTION = "http://tempuri.org/IHubService/CheckPatient";
    private static final String METHOD_NAME = "CheckPatient";
    private static final String MAIN_REQUEST_URL = "http://92.124.194.86:8686/hubservice";

    ExecutorService executor1, executor2;
    CFTBasicHttpBinding_IHubService client;
    Patient mainPatient;

    EditText edtSurename, edtName, edtBirthdate;
    Button bLogin;
    TextView lblUserInfo;
    CheckBox chbRemember;
    RelativeLayout pnlLogin;

    LinearLayout pnlInfouser, pnlMain;
    ListView lstSpecialist;
    ListSpecialistAdapter listSpecialistAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSurename = (EditText) findViewById(R.id.edtSurename);
        edtName = (EditText) findViewById(R.id.edtName);
        edtBirthdate = (EditText) findViewById(R.id.edtBirthdate);
        lblUserInfo = (TextView) findViewById(R.id.lblUserInfo);
        chbRemember = (CheckBox) findViewById(R.id.chbRemember);

        pnlMain = (LinearLayout) findViewById(R.id.pnlMain);
        pnlInfouser = (LinearLayout) findViewById(R.id.pnlInfouser);
        pnlLogin = (RelativeLayout) findViewById(R.id.pnlLogin);
        lstSpecialist = (ListView) findViewById(R.id.lstSpec);

        bLogin = (Button) findViewById(R.id.bLogin);

//прячем главную панель а панель авторизации показываем
        pnlMain.setVisibility(View.GONE);
        pnlLogin.setVisibility(View.VISIBLE);


// создание экземпляра класса клиента сервиса
        client = new CFTBasicHttpBinding_IHubService();
// создание объекта Пациент для использования в приложении(this) (idHistory = 0)
        mainPatient = new Patient(this, 0);
// загрузить данные пациента из файла
        mainPatient.LoadProperty();
//создаем сервис-исполнитель потока
        executor1 = Executors.newSingleThreadExecutor();
        executor2 = Executors.newSingleThreadExecutor();

        //создаем адаптер данных для
        listSpecialistAdapter = new ListSpecialistAdapter();
        //подцепляем адаптер к списку
        lstSpecialist.setAdapter(listSpecialistAdapter);

// обработка события нажатия кнопки ==============================================================
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CFTPatient patient = new CFTPatient();
                if (chbRemember.isChecked()) {
                    mainPatient.Surename = edtSurename.getText().toString();
                    mainPatient.Name = edtName.getText().toString();
                    mainPatient.SetBirthday(edtBirthdate.getText().toString());
                    mainPatient.SaveProperty();
                }
                patient.Name = mainPatient.Name;
                patient.Surname = mainPatient.Surename;
                patient.Birthday = mainPatient.GetBirthdate();
                // TODO: 15.02.2017 IDLPU временно берется из констант
                Log.d("MAIN", "======Request Patient ==========");
                GetCheckPatient(patient, mainPatient.LPUID, mainPatient.GUI, mainPatient.idHistory);

                pnlMain.setVisibility(View.VISIBLE);
                lblUserInfo.setText(mainPatient.Information);
                pnlLogin.setVisibility(View.GONE);
                if (mainPatient.StatusOK) {
                    //заполняем данные о мед.специалистах приписаных к пациенту
                    mainPatient.ListSpecialist.clear(); //почистим

                    RequestListSpecialist(mainPatient.LPUID, mainPatient.idPat, mainPatient.GUI, mainPatient.idHistory);

                    Log.d("MAIN", mainPatient.Information);
                }


            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        // заполнить поля авторизации
        edtSurename.setText(mainPatient.Surename);
        edtName.setText(mainPatient.Name);
        edtBirthdate.setText(MyUtil.Date2String(mainPatient.GetBirthdate(), "yyyy-MM-dd"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        mainPatient.SaveProperty();
    }

    private void GetCheckPatient(final CFTPatient patient, final int idLPU, final String guid, final int idHistory) {

        Future future = executor1.submit(new Runnable() {
            public void run() {
                CFTCheckPatientResult checkPatientResult = new CFTCheckPatientResult();
                try {
                    checkPatientResult = client.CheckPatient(patient, idLPU, guid, idHistory);
                    //забрать данные с результата авторизации пациента
                    mainPatient.idPat = checkPatientResult.IdPat;
                    mainPatient.idHistory = checkPatientResult.IdHistory;
                    mainPatient.StatusOK = checkPatientResult.Success;
                    if (checkPatientResult.Success) {
                        mainPatient.Information = String.format("%s %s Id: %s", mainPatient.Surename, mainPatient.Name, checkPatientResult.IdPat);
                        Log.d("MAIN", "----------Requesting Patient---------");
                    } else {
                        mainPatient.Information = "Ошибка авторизации пациента";
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                //handler.sendEmptyMessage(0);
            }
        });
        try {

            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void RequestListSpecialist(final int lpuid, final String idPat, final String gui, final int idHistory) {
        Future future = executor2.submit(new Runnable() {

            public void run() {
                CFTGetSpesialityListResult cftGetSpesialityListResult = new CFTGetSpesialityListResult();
                try {
                    cftGetSpesialityListResult = client.GetSpesialityList(lpuid, idPat, gui, idHistory);
                    mainPatient.StatusOK = cftGetSpesialityListResult.Success;
                    mainPatient.idHistory = cftGetSpesialityListResult.IdHistory;
                    if (mainPatient.StatusOK) {
                        mainPatient.Information = "Список мед. специалистов";
                        CFTArrayOfSpesiality cftSpesialities = new CFTArrayOfSpesiality();
                        cftSpesialities = cftGetSpesialityListResult.ListSpesiality;
                        for (int i = 0; i < cftSpesialities.size(); i++) {
                            Specialist specialist = new Specialist();
                            specialist.NameSpecialist = cftSpesialities.elementAt(i).NameSpesiality;
                            specialist.ID = cftSpesialities.elementAt(i).IdSpesiality;
                            specialist.FerIdSpesiality = cftSpesialities.elementAt(i).FerIdSpesiality;
                            specialist.CountFreeParticipant = cftSpesialities.elementAt(i).CountFreeParticipantIE;
                            specialist.CountFreeTicket = cftSpesialities.elementAt(i).CountFreeTicket;
                            specialist.setLastDate(cftSpesialities.elementAt(i).LastDate);
                            specialist.setNearestDate(cftSpesialities.elementAt(i).NearestDate);
                            mainPatient.ListSpecialist.add(specialist);
                        }
                        mainPatient.Information = String.format("всего выбрано: %d", mainPatient.ListSpecialist.size());
                        Log.d("MAIN", "----------Specialist List---------");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


}
