package com.Basic;
//
//interface Camera2{
//    void takeSnap();
//
//    void recordVideo();
//
//    private void game() {
//        System.out.println("playing");
//    }
//        default void record4kVideo(){
//        game();
//        System.out.println("Recording in 4k....");
//    }
//}
//interface Wifi2{
//    String [] getNetwork();
//    void connectToNetwork(String network);
//}
//
//class MyCellphone2{
//    void callNumber(int phoneNumber){
//        System.out.println("Calling" + phoneNumber);
//    }
//    void pickCall(){
//        System.out.println("Connecting...");
//    }

//}

//class MySmartphone2 extends MyCellphone2 implements Wifi2, Camera2{
//
//    @Override
//    public void takeSnap() {
//        System.out.println("taking Snap...");
//    }
//
//    @Override
//    public void recordVideo() {
//        System.out.println("Recording video.....");
//
//    }
//    public void recording4kVideo() {
//        System.out.println("taking snap and Recording video.....");
//
//    }
//
//    @Override
//    public String[] getNetwork() {
//        System.out.println("Getting List of Network");
//        String[] networkList = {"Harry" , "Dhiraj"};
//        return  networkList;
//    }
//
//    @Override
//    public void connectToNetwork(String network) {
//        System.out.println("Connecting to "  + network);
//
//    }
//
//    public void sampleVideo() {
//        System.out.println("sampleVideo");
//    }
//}
public class CWH_59_Polymorphism {
    public static void main(String[] args) {
       // Camera2 cam1=  new MySmartphone2(); // this is a smartphone but use it as camera
       // cam1.getNetwork(); // Not allowed camera can not use wifi method
        //cam1.sampleVideo(); //Not allowed
       // cam1.record4kVideo(); // Allowed camera can use its own method

//        MySmartphone2 ms= new MySmartphone2(); // this is smartphone  you can use every method of it and its related
//        ms.getNetwork();
//        ms.connectToNetwork("Hello");
//        ms.recording4kVideo();
//        ms.takeSnap();
//        ms.sampleVideo();
//        ms.recordVideo();
//        ms.callNumber(998515673);
//        ms.pickCall();





    }

}
