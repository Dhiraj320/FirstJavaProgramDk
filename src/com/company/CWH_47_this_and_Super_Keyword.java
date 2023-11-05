package com.company;

//This Keyword concept in details by youtube

 /*1st use
class Test{

    int i;
  public int getI() {
        return i;
    }
     public void setI(int i) {
        this.i = i;
    }

}*/

/*       2nd use
class ThisDemo{
    void display(){
        System.out.println("Hello");
    }
    void show(){
        display();
    }
}
 */

/*3rd use
class ThisDemo{
    ThisDemo(){
        this(10);
        System.out.println("Default Constructor mean no argument");

    }
    ThisDemo(int a){
        //this();
        System.out.println("Parameterised Constructor with argument");
    }
}

 */
/* 4th use
class ThisDemo{
    void m1(ThisDemo td){
        System.out.println("I am in m1 method");

    }
    void m2(){
        m1(this); // this keyword is pass as an argument in method
    }
}
 */
/*
class ThisDemo{

    void m1(){
        Test t = new Test(this);


    }

}
class Test{
    Test(ThisDemo td){
        System.out.println("Test class Constructor");

    }
}

 */
//
//class ThisDemo{
//
//   ThisDemo m1(){
//       return this;
//
//
//    }
//
//}



/*
class EkClass{
    int a;
    public int getA() {
        return a;
    }


    EkClass(int a) {
        //this.a =a; // it give 0
        this.a = a;// it give value of v and store in a

    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am constructor of DoClass ");
    }
}
*/



public class CWH_47_this_and_Super_Keyword {
    public static void main(String[] args) {

//        EkClass e = new EkClass(65);
//        DoClass d = new DoClass(5);
//        System.out.println(e.getA());


         /*1st use
//        Test t = new Test();
//        t.setI(5);
//        System.out.println(t.getI());
  */


/*       2nd use
        ThisDemo td =new ThisDemo();
        td.show();
        // both give same output
        td.display();
*/

        //3rd use
//       ThisDemo td = new ThisDemo();
//       ThisDemo td1 = new ThisDemo(8);

        //4th use
//       ThisDemo td = new ThisDemo();
//       td.m2();

        //5th use
//        ThisDemo td = new ThisDemo();
//        td.m1();

        // 6th use
//        ThisDemo td = new ThisDemo();
//        td.m1();



    }

}
