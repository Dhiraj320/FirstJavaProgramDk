package DSA.OOPs.OOps5.interfaces;

public class NiceCar {
    private Engine engine;
    private mediaPlayer music = new CDPlayer();


    public NiceCar() {
        engine = new PowerEngine();
    }


    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();

    }
    public void stop(){
        engine.stop();


    }
    public void startMusic(){

        music.start();
    }
    public void stopMusic(){

        music.stop();

    }
    public void upgradeEngine(){
        this.engine= new ElectricEngine();
    }


}
