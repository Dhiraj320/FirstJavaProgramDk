package DSA.Recursion.RecursionQuestion4Strings.Subsequence4_1;

import java.util.ArrayList;

public class Q5ReturnArrayListofStringInSubsequence {
    public static void main(String[] args) {
        System.out.println(subSequenceReturningArrayList("", "abc"));



    }


    static ArrayList<String> subSequenceReturningArrayList(String p, String up){
        ArrayList<String> list = new ArrayList<String>();
        if(up.isEmpty()){


            list.add(p);
            return list;
        }
        char ch = up.charAt(0);




        ArrayList<String> left=  subSequenceReturningArrayList(p+ch, up.substring(1));
        ArrayList<String> right=  subSequenceReturningArrayList(p, up.substring(1));
//       this print first left side  then right
//        left.addAll(right);
//        return left;
        //or //this print first right side then left
        right.addAll(left);
        return right;


    }
}
