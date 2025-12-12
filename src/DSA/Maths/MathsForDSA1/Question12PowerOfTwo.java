package DSA.Maths.MathsForDSA1;

public class Question12PowerOfTwo {
    public static void main(String[] args) {
        int n=17;
        boolean ans = ( n & (n-1))==0;
        System.out.println(ans);
    }
}
