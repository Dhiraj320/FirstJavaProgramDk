package com.DSA.linear_search.leetcode_question;

//https://leetcode.com/problems/richest-customer-wealth/

public class richest_customer_wealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        //person = row;
        //account =column
        int ans = Integer.MAX_VALUE ;
        for (int person=0; person<accounts.length; person++) {
            //when you start a new column , take a new sum for that row
            int sum =0;
            for (int account=0; account<accounts[person].length; account++){
                sum += accounts[person][account];

            }
            //when you come out of this loop
           // now we have sum of accounts of person
            //check with overall ans
            if(sum> ans){
                ans= sum;
            }
        }
        return  ans;


    }
}
