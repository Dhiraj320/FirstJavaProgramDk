package DSA.Recursion.BackTraking.Mazeproblem;

import java.util.ArrayList;

public class PrintingPath {
    public static void main(String[] args) {
        //path
        printingPath("", 3, 3);
        System.out.println(printingPathRet("", 3, 3));

    }
    //Question 2 Printing Path

    static void printingPath(String p,int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printingPath(p+'D',r-1, c);
        }
        if(c>1){
            printingPath(p+'R', r, c-1);
        }




    }
    //Question 2 Printing Path in arrayList

    static ArrayList<String> printingPathRet(String p, int r, int c){

        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        //answer that all below is added in this ansList
        ArrayList<String> ansList = new ArrayList<>();
        if(r>1){
            ansList.addAll(printingPathRet(p+'D',r-1, c));
        }
        if(c>1){
            ansList.addAll(printingPathRet(p+'R', r, c-1));
        }
        return ansList;




    }
}
