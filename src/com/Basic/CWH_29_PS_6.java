package com.Basic;

public class CWH_29_PS_6 {
    public static void main(String[] args) {
        //Question1
        //1 way
//        float [] sum = {45.7f,67.8f,63.4f,99.2f,100.0f};
//       float d=sum[0]+sum[1]+sum[2]+sum[3]+sum[4];
//        System.out.println(d);
        //2 way
     /*   float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum =0;
        for(float element : marks){
            sum = sum +element;
        }
        System.out.println("The value of sum is :" + sum);

      */

        //Question2
       /* Scanner sc =new Scanner(System.in);
        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};

        float num =67.8f;
        boolean isInArray = false;
        for(float element : marks){
            if(num ==element){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in array");
        }else{
            System.out.println("The value is not present in array");
        }

        */

        //Question3
//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//        float sum =0;
//        for(float element : marks){
//            sum = sum +element;
//        }
//        //length start form 1
////        index start from 0
//        System.out.println("The value of average is :" + sum/marks.length);




        //question4
      /*  int [][] mat1 = {{1,2,3},
                                   {4,5,6}};
        int [][] mat2 = {{7,8,9},
                                   {10,11,12}};
        int [][] result = {{0,0,0},
                                    {0,0,0}};
        for(int i=0;  i<mat1.length; i++){    // row number of times
            for(int j=0; j<mat1[i].length; j++){  // column number of time
                System.out.printf("Setting value for i=%d and j=%d \n", i ,j);
                result[i][j] =mat1[i][j] + mat2[i][j];

            }
        }
        for(int i=0;  i<mat1.length; i++){ // row number of times
            for(int j=0; j<mat1[i].length; j++){// column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] =mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }

       */

        //question 5
// 1 way
//        int [] marks ={4,5,6,7,8};
//        for(int i =marks.length-1; i>=0; i--){
//            System.out.println(marks[i]);
//        }
//
//        System.out.println("");

        //2 way
//        int arr[] = {1,5,6,7};
//        int l =arr.length;
//       int n= Math.floorDiv(l, 2);// it is give max integer of 2 number same for float and int and so on
//       int temp;
//        for(int i =0;i<n;i++ ){
//           // logic for swap a[i] = a[l-1-i]
//           temp =arr[i];
//           arr[i] =arr[l-1-i];
//           arr[l-1-i]= temp;
//       }
//       for(int element:arr){
//           System.out.println(element+" " );
//       }

        // question6
//        int arr[] = {1,5,6,7, 15, 60};
//        int max=Integer.MIN_VALUE;
//        for(int element:arr){
//            if(element>=max){
//                max=element;
//            }
//        }
//        System.out.println("Maximum value of elemnet in the array : "+ max);

        //question 7
//        int arr[] = {1,5,6,7, 15, 60};
//        int min=Integer.MAX_VALUE;
//        for(int element:arr){
//            if(element<min){
//                min=element;
//            }
//        }
//        System.out.println("Maximum value of elemnet in the array : "+ min);


        //question 8
        int arr[] = {1,5,6,7, 8, 60};
        boolean isSorted = true;
        for(int i= 0; i< arr.length-1; i++){

            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }




     }
}
