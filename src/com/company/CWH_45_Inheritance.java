package com.company;

//class Base{
//    public int x;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        System.out.println("I am in Base and setting x now");
//        this.x = x;
//    }
//
//    public void printMe(){
//        System.out.println("I am constructor");
//    }
//}

//class Derived extends Base{
//    public int y;
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        System.out.println("I am in derived and setting y now");
//        this.y = y;
//    }
//
//}

//Quiz
//class Animal{
//    public int leg;
//    public int teeth;
//
//
//    public int getLeg() {
//        return leg;
//    }
//
//    public void setLeg(int leg) {
//        this.leg = leg;
//    }
//
//
//
//    public int getTeeth() {
//        return teeth;
//    }
//
//    public void setTeeth(int teeth) {
//        this.teeth = teeth;
//    }
//
//    public void swim() {
//        System.out.println("Animal can swim.....");
//    }
//    public void eat() {
//        System.out.println("Animal can eat.....");
//    }
//
//}
//
//class Dog extends Animal{
//    public void barking() {
//        System.out.println("Dogs can bark.....");
//    }
//    public void run(){
//        System.out.println("Dogs can run");
//    }
//
//
//
//}

public class CWH_45_Inheritance {
    public static void main(String[] args) {
        // Object is created of Derived class
        // But we use getter and setter of Base class
        //so this is clear that we can inherit property and function of Base class in derive class
//        Derived d = new Derived();
//        d.setX(5);
//        System.out.println(d.getX());

        //Creating an object of base class
        // we can not access the property  and method of derive class from base class
//        Base b = new Base();
//        b.setX(5);
//        System.out.println(b.getX());
//
//        //Creating an object of derived class
//        Derived d = new Derived();
//        d.setX(43);
//        System.out.println(d.getX());
//        d.setY(222);
//        System.out.println(d.getY());


        //Quiz
//        Animal a= new Animal();
//        a.setLeg(5);
//        System.out.println( a.getLeg());
//        a.setTeeth(45);
//        System.out.println(a.getTeeth());
//        a.eat();
//
//        Dog d = new Dog();
//        d.setLeg(4);
//        System.out.println(d.getLeg());
//        d.setTeeth(25);
//        System.out.println(d.getTeeth());
//        d.swim();
//        d.run();
//        d.eat();
//        d.barking();



    }
}
