package com.company;

//Problem1
//class Circle{
//    public int radius;
//    Circle( ){
//        System.out.println("I am circle  non parameterised constructor");
//
//    }
//    Circle(int r){
//        System.out.println("I am circle parameterised constructor");
//        this.radius=r;
//
//    }
//
//    public double areaCircle(){
//        return  Math.PI*this.radius*this.radius;
//    }
//    public double volumeCircle(){
//        return  4.0/3.0*Math.PI*this.radius*this.radius*radius;
//    }
//
//}
//class Cylinder extends Circle{
//    public int height;
//    Cylinder(int r, int h){
//        super(r);
//        System.out.println("I am Cylinder parameterised constructor");
//        this.height=h;
//
//    }
//    public double areaCylinder(){
//        return  2*Math.PI*this.radius*this.radius*this.height;
//    }
//    public double volumeCylinder(){
//        return  2*Math.PI*this.radius*this.height + 2*Math.PI*this.radius*this.radius;
//    }
//
//
//}

// Problem 2 and 4 using constructor
//class Rectangle{
//    public int length;
//    public  int width;
//    Rectangle(int l , int w){
//        this.length = l;
//        this.width= w;
//    }
//
//    public double areaRectangle(){
//        return this.length*this.width;
//    }
//
//
//}

//class Cuboid extends  Rectangle{
//    public int breadth;
//    Cuboid(int l, int w, int b){
//        super(l, w);
//        System.out.println("I am Constructor of cuboid");
//        this.breadth= b;
//
//    }
//
//
//    public double areaCuboid(){
//        return 2*this.length*this.width+2*this.width*this.breadth+ 2*this.breadth*this.length;
//    }
//
//
//    public double volumeCuboid(){
//        return this.length*this.width*this.breadth;
//    }
//
//
//
//
//
//}

// Problem 2 and 4 using getter and setter
//class Rectangle1{
//    public int length;
//    public  int width;
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//

//
//    public double areaRectangle(){
//        return this.length*this.width;
//    }
//
//
//}
//
//class Cuboid1 extends  Rectangle1{
//    public int breadth;
//    public int getBreadth() {
//        return breadth;
//    }
//
//    public void setBreadth(int breadth) {
//        this.breadth = breadth;
//    }

//    public double areaCuboid(){
//        return 2*this.length*this.width+2*this.width*this.breadth+ 2*this.breadth*this.length;
//    }
//

//
//    public double volumeCuboid(){
//        return this.length*this.width*this.breadth;
//    }

//}



public class CWH_52_Ch10_PS {
    public static void main(String[] args) {

        //Problem 1,3,
//        Cylinder cy = new Cylinder(12,4);
//        System.out.println(cy.areaCircle());
//        System.out.println(cy.volumeCircle());
//        System.out.println(cy.areaCylinder());
//        System.out.println(cy.volumeCylinder());


        // Problem 2 and 4 using constructor
//        Cuboid cb = new Cuboid(2, 3, 4);
//         System.out.println(cb.areaRectangle());
//                System.out.println( cb.areaCuboid());
//                System.out.println( cb.volumeCuboid());



        // Problem 2 and 4 using getter and setter
//        Cuboid1 cb = new Cuboid1();
//        cb.setLength(2);
//        cb.setWidth(3);
//        cb.setBreadth(4);
//        System.out.println(cb.getLength());
//        System.out.println(cb.getWidth());
//        System.out.println(cb.getBreadth());
//        System.out.println(cb.areaRectangle());
//        System.out.println( cb.areaCuboid());
//        System.out.println( cb.volumeCuboid());





    }
}
