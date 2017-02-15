package ru.hardhill.hospclient;

import java.util.Date;

/**
 * Created by Waclaw on 15.02.2017.
 */

public class Specialist {
    public String ID;
    public String FerIdSpesiality;
    public String NameSpecialist;
    public int CountFreeParticipant;
    public int CountFreeTicket;
    private Date NearestDate;
    private Date LastDate;

    public Date getNearestDate() {
        return NearestDate;
    }

    public void setNearestDate(Date nearestDate) {
        NearestDate = nearestDate;
    }

    public Date getLastDate() {
        return LastDate;
    }

    public void setLastDate(Date lastDate) {
        LastDate = lastDate;
    }
}
