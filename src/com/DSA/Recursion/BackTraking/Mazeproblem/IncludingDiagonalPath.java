package com.DSA.Recursion.BackTraking.Mazeproblem;

import java.util.ArrayList;

public class IncludingDiagonalPath {
    public static void main(String[] args) {
        System.out.println(includindDiagonalPathRet("", 3, 3));

    }
    static ArrayList<String> includindDiagonalPathRet(String p, int r, int c){

        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        //answer that all below is added in this ansList
        ArrayList<String> ansList = new ArrayList<>();
        //H=Right , D=Diagonal, V= Down
        if(r>1 &&c>1){
            ansList.addAll(includindDiagonalPathRet(p+"D", r-1, c-1));
        }
        if(r>1){
            ansList.addAll(includindDiagonalPathRet(p+'V',r-1, c));
        }
        if(c>1){
            ansList.addAll(includindDiagonalPathRet(p+"H", r, c-1));
        }
        return ansList;




    }
}
