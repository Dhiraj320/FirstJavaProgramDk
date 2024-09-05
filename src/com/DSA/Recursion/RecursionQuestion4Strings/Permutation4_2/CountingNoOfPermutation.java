package com.DSA.Recursion.RecursionQuestion4Strings.Permutation4_2;

public class CountingNoOfPermutation {
    public static void main(String[] args) {
        System.out.println(permutationCount("","abc"));

    }
    static int permutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;

        }
        int count =0;

        char ch= up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            count= count+permutationCount(first+ch+second, up.substring(1));
        }
        return count;
    }
}
