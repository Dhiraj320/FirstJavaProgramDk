package DSA.Maths.MathsForDSA2;

import java.util.ArrayList;

public class FactorOFNumber {
    public static void main(String[] args) {
        int  n=20;
//        factorApproach1(n);
//        factorApproach2(n);
        factorApproach3(n);


    }
    //T.c=O(n), s.c=O(1);;
    static void factorApproach1(int n){
        for (int i = 1; i <n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    // it ignores the repeated case;
    //T.c=O(sqrt(n) , s.c=O(1);

    static void factorApproach2(int n){
        for (int i = 1; i <Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+ " ");
                }else{
                    System.out.print(i+" "+n/i +" ");

                }

            }
        }
    }
    // printed in sorted order
    //both will be  S.C. and T.c=O(sqrt(n)


    static void factorApproach3(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+ " ");
                }else{
                    System.out.print(i + " ");
                    list.add(n/i);

                }

            }
        }
        for (int i=list.size()-1; i>=0 ; i--){
            System.out.print(list.get(i)+ " ");

        }
    }


}
