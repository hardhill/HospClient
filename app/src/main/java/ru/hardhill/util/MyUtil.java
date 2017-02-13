package ru.hardhill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Waclaw on 13.02.2017.
 */

public class MyUtil {
        public static Date String2Date(String str){
        Date result = null;
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
            String dateInString = str;
            try {

                Date date = formatter.parse(dateInString.replaceAll("Z$", "+0000"));
                result = date;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        return result;
        }
}
