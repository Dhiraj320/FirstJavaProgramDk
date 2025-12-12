package DSA.Recursion.RecursionQuestion4Strings.Permutation4_2.LeetCodeQuestion;

import java.util.ArrayList;

public class DiceWithCustomFace {
    public static void main(String[] args) {
//        diceFace("", 4, 2);
        //output
//        1111
//        112
//        121
//        211
//        22

        ArrayList<String> ans=diceFaceRet("", 4, 2);
        System.out.println(ans);
        //output
        //[1111, 112, 121, 211, 22]


    }

    static void diceFace(String p, int target, int face){
        if(target==0){
            System.out.println(p);
            return ;
        }
        for(int i=1;i<=face &&i<=target;i++){
            diceFace(p+i, target-i, face);
        }
    }

    //Return ArrayList as ans
    static ArrayList<String> diceFaceRet(String p, int target, int face){
        ArrayList<String> list = new ArrayList<>();
        if(target==0){
            list.add(p);
            return list;
        }
        ArrayList<String> ansList = new ArrayList<>();
        for(int i=1;i<=6 &&i<=target;i++){
            ansList.addAll(diceFaceRet(p+i, target-i,face));
        }
        return ansList;
    }
}
