package DSA.sorting.cyclic_sort_leetcode_question;
//https://leetcode.com/problems/first-missing-positive/description/

public class FirstMissingPositive41 {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!= nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        //search for first missing positive no
        for(int index=0; index <nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        return nums.length+1;

    }
    static void swap(int[]nums, int first , int second){

        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]=temp;

    }
}

