package DSA.Recursion.RecursionQuestion4Strings.Subsequence4_1;

import java.util.ArrayList;

public class Q6SubsequenceWithASCIIVAlue {
    public static void main(String[] args) {
        subSequenceWithAscii("", "ab");

    }

    static void subSequenceWithAscii(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+ " ");
            return;
        }
        char ch =up.charAt(0);
        subSequenceWithAscii(p+ch,up.substring(1));
        subSequenceWithAscii(p, up.substring(1));
        subSequenceWithAscii(p + (ch+0), up.substring(1));

    }

    //Return ArrayList<String>

    static ArrayList<String> subSequenceReturningArrayList(String p, String up){
        ArrayList<String> list = new ArrayList<String>();
        if(up.isEmpty()){


            list.add(p);
            return list;
        }
        char ch = up.charAt(0);




        ArrayList<String> first=  subSequenceReturningArrayList(p+ch, up.substring(1));
        ArrayList<String> second=  subSequenceReturningArrayList(p, up.substring(1));
        ArrayList<String> third=  subSequenceReturningArrayList(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;



    }
}
