package com.Basic;
// Problem 1 and 2
/*abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("writing....");

    }

    @Override
    void refill() {
        System.out.println("refilling....");

    }
    void changeNib(){
        System.out.println("Changing nib");
    }
}

 */
// Problem 3 and 5
/*
class Monkey{
    void jump(){
        System.out.println("Jumping.....");

    }
    void bite(){
        System.out.println("Biting....");
    }
}
interface BasicAnimal{
     void eat();
     void sleep();
}

class Humain extends Monkey implements BasicAnimal{
    public void speak (){
        System.out.println("Speaking.....");
    }




    @Override
    public void eat() {
        System.out.println("Eating...");

    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");

    }
}





 */
// Problem 4
/*abstract  class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public void calling(){
        System.out.println("Calling....");
    }

    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void lift() {
        System.out.println("Lifting...");

    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting....");

    }
}
 */
// Problem 6 and 7
/*interface TvRemote{
    void play();
    void volumeUp();
    void volumeDown();
    default void menu(){
        System.out.println("Menu");
    }

}
interface SmartTvRemote extends TvRemote{
    void youtube();
    void amazonPrime();
}

class Tv implements TvRemote{

    @Override
    public void play() {
        System.out.println("Playing...");

    }

    @Override
    public void volumeUp() {
        System.out.println("Volume +++++");

    }

    @Override
    public void volumeDown() {
        System.out.println("Volume ----");

    }
}

 */
public class CWH_60_Ch11_PS {
    public static void main(String[] args) {
        // Problem 1 and 2
     /* FountainPen fp = new FountainPen();
      fp.write();
      fp.refill();
      fp.changeNib();

      */
        // Problem 3  5
       /* Humain h = new Humain();
//        h.eat();
//        h.sleep();
//        h.bite();
//        h.jump();
        // Problem 5 Demonstrate Polymorphism
        Monkey m1 = new Humain();
        //m1.eat();// Can not use eat because the reference is monkey which does not have eat method
        //m1.speak();Can not use speak because the reference is monkey which does not have speak method
        //m1.sleep();Can not use sleep because the reference is monkey which does not have sleep method
        //m1.jump();// Can use jump because the reference is monkey which does have jump method
        //m1.bite();// Can use bite because the reference is monkey which does have bite method

        BasicAnimal ba = new Humain();
        //ba.speak();//  Can not use speak because the reference is BasicAnimal which does not have speak method
        //ba.jump();// Can not use jump because the reference is BasicAnimal which does not have jump method
        //ba.bite();// Can not bite jump because the reference is BasicAnimal which does not have bite method
        //ba.eat();//  Can use eat because the reference is BasicAnimal which does have eat method
        //ba.sleep();//  Can use sleep because the reference is BasicAnimal which does have sleep method
        */

        // Problem 4
        /*SmartTelephone st = new SmartTelephone();
        st.calling();
        st.ring();
        st.lift();
        st.disconnect();
        // demonstrate polymorphism
        Telephone t = new SmartTelephone();
        //t.calling(); // Can not use calling because the reference is Telephone which does not have calling method
        t.ring();
        t.lift();
        t.disconnect();

         */

        // Problem 6 and 7
/*
        Tv t = new Tv();
        t.play();
        t.volumeDown();
        t.volumeUp();

 */



















    }
}
