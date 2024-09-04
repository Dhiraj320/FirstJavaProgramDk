package DSA.arrays;

public class array_questions {
    public static void main(String[] args) {

      int [] arr ={1, 10,25, 15 ,70};
        //1 swapping the value of element of array
//        swapeArrayElement(arr, 0, 3);
//        System.out.println(Arrays.toString(arr));
//2 maximum value of array
//        System.out.println(max(arr));

        // 3 maximum value in a range
//        System.out.println(maxInRange(arr, 0,3));
        // 4 reverse array
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));
       // reverse array 2nd way
        for(int i =arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }



    }

//1 swapping the value of element of array
    public  static void swapeArrayElement(int[] arr, int index1, int index2){
        int temp =arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    //2 maximum value of array
   /* public static  int  max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int maxVal =arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return  maxVal;
    }

    */

    // 3 maximum value in a range

   /* public static  int  maxInRange(int[] arr, int start , int end){
        //edge cases
        //1
        if(end>start){
            return -1;
        }
        //2
        if(arr ==null){
            return -1;
        }
        int maxVal =arr[start];
        for(int i=start; i<=end; i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return  maxVal;
    }
    */

    //reverse the array for even  element and odd element array
    // this is two pointer method
    public  static void reverseArray(int[] arr){
       int start =0;
       int end = arr.length-1;
       while(start<end){
           swapeArrayElement(arr, start , end);
           start++;
           end--;

       }


    }




}
