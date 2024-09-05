package com.DSA.OOPs.OOps5.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car= new Car();
//        Engine car1= new Car(); //type of the variable is Interface type
//        car1.a;// can not access

//        car.start();
//        car.accelerate();
//        car.brake();
//        car.stop();

//        mediaPlayer car2=new Car();
//        car2.start();

        NiceCar ownCar=new NiceCar();
        ownCar.start(); //Power Engine start
        ownCar.startMusic();// music start
        ownCar.upgradeEngine();
        ownCar.start();//Electric engine start
        ownCar.startMusic();// music start



    }
}
