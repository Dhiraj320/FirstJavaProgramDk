package DSA.OOPs.OOps3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        Shapes squareShape =new Square(); // its work and print the statement of Square class

        squareShape.area();
        //Can we do override static method for that this code
//        Shapes.greeting();
        Shapes s= new Circle();
        Circle.greeting(); // You can inherit but you can not override

    }
}
