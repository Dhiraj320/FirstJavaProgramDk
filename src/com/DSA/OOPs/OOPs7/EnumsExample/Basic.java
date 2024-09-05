package com.DSA.OOPs.OOPs7.EnumsExample;

public class Basic {
    enum Week implements A{
        Sunday,Monday,Tuesday, Wednesday, Thursday, Friday,Saturday;
        //these are enum constant

        Week() {
            System.out.println("Constructor call "+ this);
        }

        @Override
        public void greeting() {
            System.out.println("enum Interface");
        }
    }
    public static void main(String[] args) {
        Week week=Week.Monday;
        week.greeting();
        System.out.println(Week.valueOf("Monday"));
        //printing all day
//        for(Week day:Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week); // it gives Monday only because we call Monday
        System.out.println(week.ordinal()); // it gives position of that day i.e. 1



    }
}
