package com.DSA.OOPs.OOps5.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stop");

    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine accelerate");

    }
}
