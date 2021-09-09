package com.lab.promotion.util;

import java.util.Calendar;
import java.util.Date;

public class CompareBirthDays {
    private Calendar firstBirthDay;
    private Calendar secondBirthDay;


    private Calendar toCalendar(Date date){
        Calendar parsed = Calendar.getInstance();
        parsed.setTime(date);
        return parsed;
    }

    public boolean isEquals(Date a, Date b){
        firstBirthDay = toCalendar(a);
        secondBirthDay = toCalendar(b);
        return (firstBirthDay.get(Calendar.DAY_OF_MONTH) == secondBirthDay.get(Calendar.DAY_OF_MONTH)) &&
                (firstBirthDay.get(Calendar.MONTH) == secondBirthDay.get(Calendar.MONTH));
    }
}
