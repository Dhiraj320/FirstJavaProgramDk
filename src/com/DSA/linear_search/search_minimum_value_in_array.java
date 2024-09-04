package DSA.linear_search;

public class search_minimum_value_in_array {
    public static void main(String[] args) {
        int [] nums={2,4,4,5,8,6,879,2,5,3,-3,-5,-1};
        System.out.println(min(nums));
        System.out.println(max(nums));
        System.out.println(max_in_range(nums, 0,5));
        System.out.println(min_in_range(nums, 0,5));

    }
    // searching for minimum value
    static int min(int[]arr){
        int ans = arr[0]; // assuming starting element value is less
        // so compare with it if less than update otherwise print it
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    // searching for maximum value
    static int max(int[]arr){
        int ans = arr[0]; // assuming starting element value is less
        // so compare with it if less than update otherwise print it
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    // // searching between range for maximum value
    static int min_in_range(int[]arr,int start, int end ){
        int ans = arr[start]; // assuming starting element value is less
        // so compare with it if less than update otherwise print it
        for(int i = start; i <= end; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    // // searching between range for minimum value
    static int max_in_range(int[]arr,int start, int end ){
        int ans = arr[start]; // assuming starting element value is less
        // so compare with it if less than update otherwise print it
        for(int i = start; i <= end; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
