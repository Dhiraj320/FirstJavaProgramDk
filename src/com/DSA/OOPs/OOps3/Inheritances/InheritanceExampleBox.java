package DSA.OOPs.OOps3.Inheritances;

public class InheritanceExampleBox {
    public static void main(String[] args) {
/*
        // Calling Constructor 1
        Box box = new Box();//
        System.out.println(box.l + " "+ box.w + " "+  box.h ); // -1, -1, -1
        // Calling Constructor 2
        Box box1 = new Box(4);
        System.out.println(box1.l + " "+ box1.w + " "+  box1.h ); // 4, 4, 4
        // Calling Constructor 3
        Box box2 = new Box(5, 5,5);
        System.out.println(box2.l + " "+ box2.w + " "+  box2.h ); // -1, -1, -1
        */
        /*
        BoxWeight boxWeight = new BoxWeight();
        System.out.println(boxWeight.h+""+boxWeight.weight);
        BoxWeight boxWeight2 = new BoxWeight(3,4,5,6);
        System.out.println(boxWeight2.h+" "+boxWeight2.weight+ " " +" "+boxWeight2.h);

         */


/*
        Box box3=new BoxWeight(2,3,4,5);
        System.out.println(box3.weight);// not access weight because box3 is referencing to the Parent class
     */
        /*
     BoxWeight boxWeight1= new Box(); // its give error because object itself is type of Parent class how will
        //you call the constructor of child class
            */

        //for Multilevel Inheritance
        Boxprice box4 =new Boxprice();
        Boxprice box5 =new Boxprice(5, 20, 200);







    }
}

class Box{
    private double l; // so it can not be access by super keyword of child class
    double h;
    double w;
    // Constructor 1 without any argument
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;

    }
    // Constructor 2 with 1 argument
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;


    }

    // Constructor 3 with three argument
     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l =old.l;
        this.h = old.h;
        this.w = old.w;


    }

    public void information(){
        System.out.println("Running the box");

    }
}

class BoxWeight extends Box {


    double weight;

    public BoxWeight() {
        this.weight = -1;

    }
    public BoxWeight(double side, double weight) {
       super(side);
       this.weight = weight;
    }
    public BoxWeight(Boxprice other) {
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // This is super keyword its calling the Parent class constructor
        //so the super is used to initialize value present in Parent class
        this.weight = weight;
        //super(l, h, w);// it will give error if it initializes after child class contain so initialize before child class contain
        //this.l =l;// //can not access because it is  private in Parent class
        this.w=w;//can access because it is not private in Parent class


    }


}

class Boxprice extends BoxWeight{
    double cost;

    Boxprice(){
        super();
        this.cost= -1;
    }

    Boxprice(Boxprice other){
        super(other);
        this.cost = other.cost;

    }


    public Boxprice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }



    public Boxprice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }



}