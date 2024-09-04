package DSA.OOPs.OOps3.Polymorphism;

public class Circle extends Shapes{
    //this will run when obj of Circle is created
    // hence it's overriding the Parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area is pi * r * r");
    }
//// @Override
//    static void greeting(){
//        System.out.println("I am in Circle");
//    }

}
