package DSA.Recursion.Recursion2BasicQuestion;

public class Q6ProductOfDigits {
    public static void main(String[] args) {
        int ans =productOfDigits(1342);
        System.out.println(ans);

    }

    static int productOfDigits(int n){

        if(n%10==n){
            return n;
        }
        return (n%10) *productOfDigits(n/10);
    }
}
