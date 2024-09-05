package com.DSA.String;

public class Strings {
    public static void main(String[] args) {

//        String a= kunal;
//        System.out.println(a);

        //String Immutability
      /*  String a= "kunal";
        System.out.println(a);
        a= "kushwaha";
        System.out.println(a);

       */


/*
        //String Comparision
        //== method
        String a= "kunal";
        String b= "kunal" ;
        System.out.println(a==b);  // give true;

         String a= "kunal";
        String b= "Dhiraj" ;
        System.out.println(a==b);  // give false;



        String a = new String("Kunal");
        String b = new String("Kunal");
        System.out.println(a==b); // give false

         */

        //.equal() method
//        String a= "kunal";
//        String b= "kunal" ;
//        System.out.println(a.equals(b));  // give true;

//        String a = new String("Kunal");
//        String b = new String("Kunal");
//        System.out.println(a.equals(b)); // give true

//        String a = new String("Kunal");
//        String b = new String("Dhiraj");
//        System.out.println(a.equals(b)); // give false

//        String a= "kunal";
//        String b= "Dhiraj" ;
//        System.out.println(a.equals(b));  // give false;

//String Concatenation
//        System.out.println(new ArrayList<>()+ ""+ new ArrayList<>());



        //String Performance
        /*
        String series = "";
        for(int i=0; i<26;i++){
            char ch = (char)('a'+i);
            System.out.println(ch);
        }

         */

        //or
         String series = "";
            for(int i=0; i<26;i++){
           char ch = (char)('a'+i);

series= series+ch;
        }
        System.out.println(series);













    }
}
