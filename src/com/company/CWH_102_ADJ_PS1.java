package com.company;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;


public class CWH_102_ADJ_PS1 {
    public static void main(String[] args) {
        //Question1
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("Dhiraj");
//        arr.add("Rashi");
//        arr.add("Harsh");
//        arr.add("GauravTi");
//        arr.add("GauravTo");
//        arr.add("Dev");
//        arr.add("Sanket");
//        arr.add("Kartik");
//        arr.add("Shraddha");
//        arr.add("HarshS");
//        for (String element:arr
//             ) {
//            System.out.print(element + ", " );
//
//        }

        //Question2
//        Date d = new Date();
//        System.out.println(d.getHours() + ":"  +d.getMinutes()+ ":" +d.getSeconds() );
//
//        //Question3
//        Calendar c =  Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR)+ ":"  +c.get(Calendar.MINUTE)+ ":"  +c.get(Calendar.SECOND));

        //Question4
        LocalDateTime dt =  LocalDateTime.now();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(dtf);
        System.out.println(myDate);






        //Question5
//        HashSet<Integer> s = new HashSet();
//        s.add(5);
//        s.add(6);
//        s.add(46);
//        s.add(66);
//        s.add(9);
//        s.add(6);
//        System.out.println(s);

    }
}
