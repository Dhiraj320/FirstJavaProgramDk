package DSA.OOPs.OOps5.AbstratcClass;

public class Son extends Parent {
    public Son(int age) {
        super(age);

    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be doctor");


    }

    @Override
    void love() {
        System.out.println("I love Nurse");

    }
}
