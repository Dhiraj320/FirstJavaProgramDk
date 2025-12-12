package DSA.Recursion.RecursionQuestion4Strings.Permutation4_2.LeetCodeQuestion;

import java.util.ArrayList;

public class NumberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {
//        dice("", 4);
        ArrayList<String> ans=diceRet("", 4);
        System.out.println(ans);

    }
/*
    static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return ;
        }
        for(int i=1;i<=6 &&i<=target;i++){
            dice(p+i, target-i);
        }
    }

 */
// Return ArrayList of ans
    static ArrayList<String> diceRet(String p, int target){
        ArrayList<String> list = new ArrayList<>();
        if(target==0){
            list.add(p);
            return list;
        }
        ArrayList<String> ansList = new ArrayList<>();
        for(int i=1;i<=6 &&i<=target;i++){
            ansList.addAll(diceRet(p+i, target-i));
        }
        return ansList;
    }


}
