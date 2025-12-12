package DSA.OOPs.OOps5.interfaces;

public class Car implements Engine,Break,mediaPlayer{
    int a=30;
    @Override
    public void brake() {
        System.out.println("I am break");

    }

    @Override
    public void start() {
        System.out.println("I am engine start");

    }

    @Override
    public void stop() {
        System.out.println("I am engine stop");

    }

    @Override
    public void accelerate() {
        System.out.println("I am accelerate");

    }
}
