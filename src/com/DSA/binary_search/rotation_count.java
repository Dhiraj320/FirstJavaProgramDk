package DSA.binary_search;

public class rotation_count {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));

    }

     static int countRotations(int[] arr) {
        int pivot= findPivot(arr);
        return pivot+1;

    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end ){

            int mid =start+(end-start)/2;
            // 4 cases over here
            //1
            if(mid <end && arr[mid]> arr[mid+1]){
                return mid;


            }
            //2
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;


            }
            //3 and 4
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }
// for duplicate value
    /*
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end ){

            int mid =start+(end-start)/2;
            // 4 cases over here
            //1
            if(mid <end && arr[mid]> arr[mid+1]){
                return mid;


            }
            //2
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;


            }
            //3 and 4
            // if the element are at start end and middle are equal/ same just skip this duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicate
                // before skip the duplicate check start is pivot or not
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;  // use of this skip  duplicate start element

                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--; // use of this skip duplicate end element
            }

            //left side is sorted , so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start]== arr[mid] &&arr[mid]>arr[end])){
                start = mid+1;
            }else{
                end= mid-1;
            }



        }
        return -1;
    }

     */
}
