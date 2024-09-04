package DSA.binary_search;

import java.util.Arrays;

public class search_in_2d_array_SortedMatrix {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3,4},
                {5,6,7,8},
                {8,9,10,11,12},
                {13,14,15,16}


        };
        System.out.println(Arrays.toString(search(arr, 7)));

    }


// search in the row provided between the columns provided
    static int[]binarySearch(int[][]matrix, int row, int colStart, int colEnd, int target){
        while(colStart<=colEnd){
            int mid = colStart +(colEnd-colStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row, mid};

            }
            if(matrix[row][mid]<target){
                colStart=mid+1;


            }else{
                colEnd=mid-1;

            }
        }
        return new int[]{-1,-1};
    }
    static int[]search(int[][] matrix, int target){
        int row =matrix.length;
        int col=matrix[0].length;// be cautious, matrix may be empty  //apply check here for this
        if(row==1){
            return binarySearch(matrix, 0, 0, col-1, target);
        }
        // run the loop till 2 row are remaining
        int rowStart=0;
        int rowEnd=row-1;
        int colMid=col/2;
        while(rowStart<(rowEnd-1)){// while this is true it will have more than 2 row
            int mid=rowStart+ (rowEnd-rowStart)/2;
            if(matrix[mid][colMid]==target){
                return new int[]{mid,colMid};

            }
            if(matrix[mid][colMid]<target){
                rowStart=mid;

            }else{
                rowEnd=mid;
            }

        }
       // now we have two rows
        // check whether the target is in the col of 2 rows
        if(matrix[rowStart][colMid]==target){
            return new int[]{rowStart,colMid};
        }
        if(matrix[rowStart+1][colMid]<target){
            return new int[]{rowStart+1,colMid};
        }
        //search in first part
        if(target<=matrix[rowStart][colMid-1]){
            return binarySearch(matrix, rowStart, 0, colMid-1, target);

        }
        //search in second part
        if(target>=matrix[rowStart][colMid+1]&&target<=matrix[rowStart][col-1]){
            return binarySearch(matrix, rowStart, colMid+1, col-1, target);

        }
        //search in third part
        if(target<=matrix[rowStart+1][colMid-1]){
            return binarySearch(matrix, rowStart+1,0, colMid-1,target);

        }
        //search in fourth part
        if(target>=matrix[rowStart+1][colMid+1]){
            return binarySearch(matrix, rowStart+1, colMid+1, col-1, target);

        }
        return new int[]{-1,-1};

    }
}

