package com.Basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CWH_100_Java_time_package {
    public static void main(String[] args) {
        //Immntable
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime dt =  LocalDateTime.now();
        System.out.println(dt);



        //DTF Formater
        //DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy");// This is format
        //or
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd||MM||yyyy --E H:m a");
        String myDate = dt.format(dtf);
        System.out.println(myDate);
        // Some Default dtf
        DateTimeFormatter ddtf= DateTimeFormatter.ISO_LOCAL_DATE;
        String dDate = dt.format(ddtf);
        System.out.println(dDate);




    }
}
