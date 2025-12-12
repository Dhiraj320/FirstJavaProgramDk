package DSA.OOPs.OOps5.AbstratcClass;

public class Main {
    public static void main(String[] args) {
        Son s= new Son(24);
        s.career();
        Daughter d= new Daughter(21);
        d.career();
//        Parent mom = new Parent(45) ;// no give error
        Parent.hello();
        s.normal();




    }
}
