package DSA.Maths.MathsForDSA1;

public class Question14NoOfSetBit {
    public static void main(String[] args) {
//       Approach 1
//        int n= 9;
//        int counter =0;
//        while(n>0){
//            if((n&1)==1){
//                counter++;
//
//            }
//            n=n>>1;
//        }
//        System.out.println(counter);



        //Approach 2
        int n= 10;
        System.out.println(Integer.toBinaryString(10)); // it give binary number of n that is 10

        System.out.println(setBits(n));


    }

    private static int setBits(int n) {
        int count=0;
        while(n>0){

             n=n-(n&-n); //or n = n &(n-1)
            count++;


        }
        return count;
    }
}
