package DSA.OOPs.OOps3.Polymorphism.TypeOfPolymorphism;

public class CompileTime {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        CompileTime n = new CompileTime();
        n.sum(2,4);
        n.sum(2,3,4);
    }
}
