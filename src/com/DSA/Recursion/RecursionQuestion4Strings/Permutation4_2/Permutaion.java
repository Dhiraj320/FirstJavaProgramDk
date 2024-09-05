package com.DSA.Recursion.RecursionQuestion4Strings.Permutation4_2;

public class Permutaion {
    public static void main(String[] args) {
        permutation("", "123");


        /*ArrayList<String> ans =permutation("", "abc");
        System.out.println(ans);

         */



    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+ " ");
            return;
        }

        char ch= up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            permutation(first+ch+second, up.substring(1));
        }
    }







    // Returning output as an ArrayList of above
/*
    static ArrayList<String> permutation(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
           list.add(p);
            return list;
        }

        char ch= up.charAt(0);
        //answer that all below is added in this ansList
        ArrayList<String> ansList = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            ansList.addAll(permutation(first+ch+second, up.substring(1)));
        }
        return ansList;
    }

 */


}
