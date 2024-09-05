package com.DSA.Recursion.RecursionQuestion4Strings.Subsequence4_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterativeProgramToPrintWithSubSequenceTakingArrayAs {
    public static void main(String[] args) {
//        int []arr={1,2,3};
//        List<List<Integer>> ans=subSequence(arr);
//        for (List<Integer> list:ans) {
//            System.out.print(list);
//
//        }
        //for duplicate
        int []arr={1,2,2};
        List<List<Integer>> ans=subSequenceDuplicate(arr);
        for (List<Integer> list:ans) {
            System.out.print(list);

        }


    }
    //If array have not duplicate element
    /*
    static List<List<Integer>> subSequence(int []arr){
        List<List<Integer>> outerArrayList=new ArrayList<>();
        outerArrayList.add(new ArrayList<>());

        for(int num:arr){
            int outerListSize=outerArrayList.size();
            for(int i=0;i<outerListSize;i++){
                List<Integer> internalArrayList=new ArrayList<>(outerArrayList.get(i));
                internalArrayList.add(num);// the current no at you add this in List
                outerArrayList.add(internalArrayList);
            }


        }


        return outerArrayList;

    }

     */
    //If array have duplicate element
    //first sort it because duplicate element should be together

    static List<List<Integer>> subSequenceDuplicate(int []arr){
        Arrays.sort(arr);
        List<List<Integer>> outerArrayList=new ArrayList<>();
        outerArrayList.add(new ArrayList<>());
        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++){
            start=0;
            //if previous and current elementis same start=end+1
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end= outerArrayList.size()-1;
            int outerListSize=outerArrayList.size();
            for(int j=start;j<outerListSize;j++){
                List<Integer> internalArrayList=new ArrayList<>(outerArrayList.get(j));
                internalArrayList.add(arr[i]);// the current no at you add this in List
                outerArrayList.add(internalArrayList);
            }


        }


        return outerArrayList;

    }
}
