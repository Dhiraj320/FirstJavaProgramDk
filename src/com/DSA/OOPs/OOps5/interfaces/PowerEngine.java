package com.DSA.OOPs.OOps5.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stop");

    }

    @Override
    public void accelerate() {
        System.out.println("Power Engine accelerate");

    }
}
