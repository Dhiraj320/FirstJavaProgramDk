package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class CWH_98_Calendar_class_ {
    public static void main(String[] args) {
        // mutable

        // Calendar class is an abstract class
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());// it gives gregory calendar
//        System.out.println(c.getTimeZone());


//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("US/Central"));
//        System.out.println(c.getCalendarType());// it gives gregory calendar
//        System.out.println(c.getTimeZone().getID());

//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());// it gives gregory calendar
//        System.out.println(c.getTimeZone().getID());
//        System.out.println(c.getTime());


        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        System.out.println(c.get(Calendar.MILLISECOND));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":"+ c.get(Calendar.MINUTE) +":" +c.get(Calendar.SECOND));

        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));




    }
}
