package DSA.binary_search.leetcode_question;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {


    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start < end){
            int mid =start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are decreasing part of array
                //this may be ans, but look at the left
                // ths is my why end not equal to mid-1
                end = mid;

            }else{
                // you are in ascending part of array
                start = mid+1; // because we know mid+1 element > mid element
            }

        }
        // in the end, start ==end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        return start;  // or we can also return end because at the end both are equal


}
}
