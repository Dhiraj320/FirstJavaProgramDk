package DSA.binary_search;

import java.util.Arrays;

public class search_in_2d_array_RowColMatrix {
    public static void main(String[] args) {
        int [][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
//                {33,34,38,50},
        };
        System.out.println(Arrays.toString(search(arr, 37)));

    }
/*
    //for N*N(N row, N column)

    static int[]search(int[][] matrix, int target){
        int row =0;
        int column =matrix.length-1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==target){
                return new int[]{row,column};
            }
            if(matrix[row][column]<target){
                 row++;
            }else{
                column--;
            }

        }
        return new int[]{-1,-1};
    }

 */

    //for N*M(N =row, M =column)
    //here row =0; column = column length
    static int[]search(int[][] matrix, int target){
        int row =0;
        int column =3;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==target){
                return new int[]{row,column};
            }
            if(matrix[row][column]<target){
                row++;
            }else{
                column--;
            }

        }
        return new int[]{-1,-1};
    }


}
