package ru.hardhill.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Waclaw on 13.02.2017.
 */

public class MyUtil {
    public static Date String2Date(String str) {
        Date result = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateInString = str;
        try {

            Date date = formatter.parse(dateInString);
            result = date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String Date2String(Date date, String sf) {
        String s = "";
        DateFormat df = new SimpleDateFormat(sf);
        //Date today = Calendar.getInstance().getTime();
        s = df.format(date);
        return s;
    }
}
