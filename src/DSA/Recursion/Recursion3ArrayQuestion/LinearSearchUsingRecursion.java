package DSA.Recursion.Recursion3ArrayQuestion;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[]arr={3,2,1,18,9};
        System.out.println(linearSearchIndexFromLast(arr));

    }

    //return true or false element find or not;
/*
    static boolean linearSearch(int[] arr){
        int start=0;
        int target=18;
        return helper(arr, target, start);
    }

    public static boolean helper(int[]arr, int target, int start) {
        if(start==arr.length){
            return false;
        }
        return (arr[start]==target)||helper(arr, target,start+1);

    }

 */


    //return index of the element that is element find or not;
  /*  static int linearSearchIndex(int[] arr){
        int index=0;
        int target=18;
        return helper(arr, target, index);
    }

    public static int helper(int[]arr, int target, int index) {
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return helper(arr, target,index+1);

        }


    }


   */


    static int linearSearchIndexFromLast(int[] arr){
        int index=arr.length-1;
        int target=18;
        return helper(arr, target, index);
    }

    public static int helper(int[]arr, int target, int index) {
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return helper(arr, target,index-1);

        }


    }
}
