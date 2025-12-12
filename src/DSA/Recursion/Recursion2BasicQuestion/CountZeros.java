package DSA.Recursion.Recursion2BasicQuestion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(30204));

    }
    static int countZeros(int n){
        return helper(n, 0);
    }

    //special pattern , how to pass a value to above function

    public static int helper(int n, int counter) {
        if(n==0){
            return counter;
        }
        int remainder=n%10;
        if(remainder==0){
            return helper(n/10, counter+1);

        }
        return helper(n/10, counter);

    }

}
