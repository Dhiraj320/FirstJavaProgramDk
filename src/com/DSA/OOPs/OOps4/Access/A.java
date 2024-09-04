package DSA.OOPs.OOps4.Access;

public class A {

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num ;
    String name;
     int[]arr;
    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
