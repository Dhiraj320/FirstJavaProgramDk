package DSA.Maths.LeetCodeQuestion;

public class BulbSwitcher319 {
    public static void main(String[] args) {
        System.out.println(bulbSwitch(20));
        System.out.println(bulbSwitch2(20));

    }
    //Approach-1 BruteForce T.C.=O(n), SC=(1)
    public static int bulbSwitch(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            count++;
        }

       return count;
    }

    //Approach 2 T.C.= O(sqrt(n)), S.C.=O(1)
    public static int bulbSwitch2(int n) {
        return (int) Math.sqrt(n);

    }




}
