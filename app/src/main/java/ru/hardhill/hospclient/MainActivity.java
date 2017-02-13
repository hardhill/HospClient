package ru.hardhill.hospclient;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;


import java.io.IOException;

import ru.hardhill.hubservice.CFTBasicHttpBinding_IHubService;
import ru.hardhill.hubservice.CFTCheckPatientResult;
import ru.hardhill.hubservice.CFTPatient;
import ru.hardhill.util.MyUtil;


public class MainActivity extends AppCompatActivity {
    final static String USERNAME = "мунко";
    final static String SURENAME = "раднаев";
    final static String BIRTHDAY = "1986-10-15T00:00:00";
    final static String GUID = "59432A7C-1907-47EC-A721-5B6C3FFBF47B";
    final static int IDLPU = 2301001;
    final static  String URI = "http://92.124.194.86:8686/hubservice";
    final static String TEMPURI = "http://tempuri.org/";
    private static final String SOAP_ACTION = "http://tempuri.org/IHubService/CheckPatient";
    private static final String METHOD_NAME = "CheckPatient";
    private static final String MAIN_REQUEST_URL = "http://92.124.194.86:8686/hubservice";
    private String response;



    EditText edtResult;
    Button bLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtResult = (EditText)findViewById(R.id.editText);
        bLogin = (Button)findViewById(R.id.button);

        String methodname = "CheckPatient";
        SoapObject request = new SoapObject(TEMPURI, methodname);


        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CFTPatient patient = new CFTPatient();
                patient.Name = USERNAME;
                patient.Surname = SURENAME;
                patient.Birthday = MyUtil.String2Date(BIRTHDAY);

                GetCheckPatient(patient, IDLPU, GUID, 0);
            }
        });
    }


    // === перехватывает сообщения от другого процесса
    public Handler handler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {

                case 0:
                    edtResult.setText(response);
                    break;
            }
            return false;
        }
    });

    private final void GetCheckPatient(final CFTPatient patient,final int idLPU,final String guid,final int idHistory) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                CFTBasicHttpBinding_IHubService client = new CFTBasicHttpBinding_IHubService();

                CFTCheckPatientResult checkPatientResult = new CFTCheckPatientResult();

                try {
                   checkPatientResult = client.CheckPatient(patient,idLPU,guid,idHistory);
                   response = String.format("Идентификатор пациента: %s, Номер истории болезни: %d",checkPatientResult.IdPat,checkPatientResult.IdHistory);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                handler.sendEmptyMessage(0);
            }
        }).start();
    }







}
