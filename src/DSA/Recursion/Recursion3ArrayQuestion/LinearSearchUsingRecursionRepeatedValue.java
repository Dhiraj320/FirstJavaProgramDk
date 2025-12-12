package DSA.Recursion.Recursion3ArrayQuestion;

import java.util.ArrayList;

public class LinearSearchUsingRecursionRepeatedValue {
    public static void main(String[] args) {
        int[]arr={3,2,1,18,18};
//        ArrayList<Integer>ans=linearSearchForAllRepeatedIndex(arr,18,0); // for Passing The ArrayList inside argument

        System.out.println(linearSearchForAllRepeatedIndex(arr,18,0));//Without Passing The ArrayList inside argument

    }
    /*
   public static void linearSearchForAllRepeatedIndex(int[] arr){
        int index=0;
        int target=18;
        helper(arr, target, index);
    }

    static ArrayList<Integer> list=new ArrayList<>();// this is created outside the function

    public static void helper(int[]arr, int target, int index) {
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }

        helper(arr, target,index+1);


    }

     */


    //Passing The ArrayList inside argument  //use this approach  //here the list is updated//
/*
    public static ArrayList<Integer> linearSearchForAllRepeatedIndex(int[]arr, int target, int index,ArrayList<Integer> list) {
        if(index==arr.length){
            return list ;
        }
        if(arr[index]==target){
            list.add(index);
        }

        return linearSearchForAllRepeatedIndex(arr, target,index+1, list);


    }
    */



    //Without Passing The ArrayList inside argument  // Don't use this approach because list is created again and again
    //it may be used in some problem so understand it

    public static ArrayList<Integer> linearSearchForAllRepeatedIndex(int[]arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // this is created inside the body fo function
        if(index==arr.length){
            return list ;
        }
        //this will contain answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }

         ArrayList<Integer> answerFromBelowCalls=linearSearchForAllRepeatedIndex(arr, target,index+1);

        list.addAll(answerFromBelowCalls);

        return list;



    }





}
