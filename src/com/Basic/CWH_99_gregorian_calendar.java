package com.Basic;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH_99_gregorian_calendar {
    public static void main(String[] args) {
        // mutable
        // gregorian is a concrete class and it is a subclass of Calendar class
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));
        System.out.println(cal.getTime());
        System.out.println(cal.getCalendarType());


        //TimeZone
        // total time zone is 627
        for(int i = 0; i<=627;i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
            System.out.println(TimeZone.getDefault());








    }
}
