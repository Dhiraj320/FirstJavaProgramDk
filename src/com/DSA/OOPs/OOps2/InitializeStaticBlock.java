package DSA.OOPs.OOps2;

public class InitializeStaticBlock {

    static int a = 4;
    static int b;

    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        InitializeStaticBlock obj = new InitializeStaticBlock();
        System.out.println(InitializeStaticBlock.a + " " + InitializeStaticBlock.b);

        InitializeStaticBlock.b += 3;

        System.out.println(InitializeStaticBlock.a + " " + InitializeStaticBlock.b);

        InitializeStaticBlock obj2 = new InitializeStaticBlock();
        System.out.println(InitializeStaticBlock.a + " " + InitializeStaticBlock.b);
    }

}