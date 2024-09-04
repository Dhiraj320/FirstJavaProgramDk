package DSA.Recursion.Recursion_1;

public class Fibonacci_Number {
    public static void main(String[] args) {
        int ans = fib(4);
        System.out.println(fib(ans));



    }

    public static int fib(int n){
        //base condition
//        if(n==0){
//            return n;
//        }
//        if(n==1){
//            return n;
//        }
        //or
        if(n<2) {
            return n;
        }


        return fib(n-1)+fib(n-2);
    }
}
