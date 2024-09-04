package DSA.Recursion.Recursion_1;

public class Powx_n_Leetcode50 {
    public static void main(String[] args) {

        System.out.println(myPow(4, 6));

    }
    public static double myPow(double x, int n) {
        return solve(x, (long) n);

    }
    public static double solve(double x , long n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return solve(1/x, -n);
        }
        if(n%2== 0){
            return solve(x*x, n/2);
        }else{
            return x*solve(x*x, (n-1)/2);
        }
    }
}
