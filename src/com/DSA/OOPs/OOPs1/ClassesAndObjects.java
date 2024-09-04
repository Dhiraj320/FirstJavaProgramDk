package DSA.OOPs.OOPs1;

public class ClassesAndObjects {
    public static void main(String[] args) {
//        Students[] student = new Students[5];




        Students kunal= new Students();
        Students dhiraj= new Students(25,"Hlo",85.09f);
//     ByDefault Constructor if Constructor is note Created inside class
/*
        System.out.println(kunal.rollNo);//give 0
        System.out.println(kunal.name);// give null;
        System.out.println(kunal.marks); // it give 0.0 value

 */
        //      Constructor Created

        System.out.println(kunal.rollNo);//give 14
        System.out.println(kunal.name);// give Hello;
        System.out.println(kunal.marks); // it give 45.0 value

        //      Constructor Created

        System.out.println(dhiraj.rollNo);//give 25
        System.out.println(dhiraj.name);// give Hlo;
        System.out.println(dhiraj.marks); // it give 85.09 value

        dhiraj.greeting();
        kunal.greeting();
//Memory allocation for new keyword
        Students one = new Students();
        Students two = one;
        one.name="Something";// changing tha name of one
        System.out.println(two.name); // but it will also change for two







    }

}
class Students{
    int rollNo;
    String name;
    float marks;

    void greeting(){
        System.out.println("My names is "+ this.name);
    }

    //Constructor Created Without passing Argument
    //  Students kunal= new Students();
    //here this keyword is replaced with kunal
//    Students(){
//        this.rollNo=14;
//        this.name="Hello";
//        this.marks=45.0f;
//
//    }
    //Constructor Created With passing Argument
    //Students dhiraj= new Students(25,"Hlo",856.2f);
    //here this keyword is replaced with dhiraj
    Students(int rollNo, String name,float marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;

    }

    //Calling Constructor from another constructor
    Students(){
        // internally : new Student(13,"KKK",582.5f);
        this(13,"KKK",582.5f);
    }


}
