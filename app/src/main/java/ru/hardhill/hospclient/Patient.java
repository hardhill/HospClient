package ru.hardhill.hospclient;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import ru.hardhill.util.MyUtil;

/**
 * Created by Waclaw on 13.02.2017.
 */
public class Patient {
    public static final String APP_PREFERENCES = "personsettings";
    final static String GUID = "59432A7C-1907-47EC-A721-5B6C3FFBF47B";
    final static int IDLPU = 2301001;
    public String Name;
    public String Surename;
    public String GUI;
    public int LPUID;
    public String idPat;
    public int idHistory;
    public boolean StatusOK;
    public String Information;
    public List<Specialist> ListSpecialist;
    private SharedPreferences mSettings;
    private Date Birthday;

    public Patient(Context ctx, int i) {
        mSettings = ctx.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        this.idHistory = i;
        this.Birthday = Calendar.getInstance().getTime();
        this.Surename = "Фамилия";
        this.Name = "Имя";
        this.idPat = "";
        this.LPUID = IDLPU;
        this.GUI = GUID;
        this.StatusOK = false;
        this.Information = "";
        this.ListSpecialist = new ArrayList<Specialist>();
    }


    public void LoadProperty() {
        // загрузили данные
        // Получаем число из настроек
        String ls = mSettings.getString("Birthday", "1900-01-01");
        this.Birthday = MyUtil.String2Date(ls);
        this.Surename = mSettings.getString("Surename", "");
        this.Name = mSettings.getString("Name", "");
    }

    public void SaveProperty() {
        // Запоминаем данные

        SharedPreferences.Editor editor = mSettings.edit();
        editor.putString("Birthday", MyUtil.Date2String(Birthday, "yyyy-MM-dd"));
        editor.putString("Name", Name);
        editor.putString("Surename", Surename);
        editor.apply();
    }

    public Date GetBirthdate() {
        return this.Birthday;
    }

    public void SetBirthday(String s) {
        this.Birthday = MyUtil.String2Date(s);
    }
}
