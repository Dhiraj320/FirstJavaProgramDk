package DSA.binary_search.leetcode_question;

public class ceiling_of_a_given_number {
    public static void main(String[] args) {
        //using binary search
        //ascending order sorted array
        int []arr ={2,3,5,9,14,16,18};
        int target=25;
        int ans = ceilingNumberAscending(arr, target);
        System.out.println(ans);
        int []arr2 ={2,3,5,9,14,16,18};
        int target2=16;
        int ans2 = floorNumberAscending(arr2, target2);
        System.out.println(ans2);

    }

    // search the array: return the element: smaller>=target
    //otherwise if item not found return start element

    static int ceilingNumberAscending(int []arr, int target){
        //edge case
        //but what if the target is greater than the greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;

        }
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            //find middle element
            /*int mid = (start+ end) /2;  //might be possible that (start+end) exceeds the range of integer in java
            // so it give the error
             */
            //sor for that the better approach is
            int mid =start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;

            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return arr[mid];
                // for index
                //return mid;
            }
            // if any of them if else condition true then element not found

        }
        return arr[start];
        // for index
        //return start;


    }
    // search the array: return the element : greatest<=target
    //otherwise if item not found return end element

    static int floorNumberAscending(int []arr, int target){
        //edge case
        //but what if the target is greater than the greatest number in the array
//        if(target>arr[arr.length-1]){
//            return -1;
//
//        }
        //but here we dont need to do this
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            //find middle element
            /*int mid = (start+ end) /2;  //might be possible that (start+end) exceeds the range of integer in java
            // so it give the error
             */
            //sor for that the better approach is
            int mid =start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;

            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return arr[mid];
                // for index
                //return mid;
            }
            // if any of them if else condition true then element not found

        }
        return end;



    }
}
