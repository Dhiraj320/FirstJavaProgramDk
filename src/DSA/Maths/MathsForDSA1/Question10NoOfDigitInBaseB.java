package DSA.Maths.MathsForDSA1;

public class Question10NoOfDigitInBaseB {
    public static void main(String[] args) {
        int n= 50;
        int b=2;
        int ans =(int)(Math.log(n) / Math.log(b))+1;
        System.out.println(ans);
    }
}
