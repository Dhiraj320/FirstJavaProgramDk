package DSA.Recursion.Recursion_1;

public class Recursion_Of_Number_Program {
    public static void main(String[] args) {

    }
    public static void print(int n) {
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
