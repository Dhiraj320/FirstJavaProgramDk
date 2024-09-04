package DSA.Maths.MathsForDSA1;

public class Question13Power {
    public static void main(String[] args) {
        int base =2;
        int power =-2;
        int ans=1;
        while(power>0){
            if((power&1)==1){
                ans=ans*base;

            }
            base =base*base;
            power=power>>1;
        }
        System.out.println(ans);

    }

}
