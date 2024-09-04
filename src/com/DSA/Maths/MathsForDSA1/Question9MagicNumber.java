package DSA.Maths.MathsForDSA1;

public class Question9MagicNumber {
    public static void main(String[] args) {
        int n= 3;
        int ans =0;
        int base=5;
        while(n>0){
            int lastDigitOfNumber= n & 1;
            n= n >>1;
            ans=ans+lastDigitOfNumber*base;
            base = base *5;

        }


        System.out.println(ans);
    }
}
