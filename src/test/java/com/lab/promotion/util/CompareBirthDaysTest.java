package com.lab.promotion.util;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CompareBirthDaysTest {

    @Test
    void isEquals() {
        CompareBirthDays compare = new CompareBirthDays();
        Date dateone = new Date(99, Calendar.NOVEMBER, 13);
        Date datetwo = new Date(99, Calendar.NOVEMBER, 13);
        boolean res = compare.isEquals(dateone, datetwo);
        assertEquals(true, res);
    }
}