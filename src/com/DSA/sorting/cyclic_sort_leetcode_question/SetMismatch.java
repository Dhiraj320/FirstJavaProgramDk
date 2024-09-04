package DSA.sorting.cyclic_sort_leetcode_question;
//https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch {
    public static void main(String[] args) {

    }
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]!= nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        //search for first missing no
        for(int index=0; index <nums.length;index++){
            if(nums[index]!=index+1){
                return new int[] {nums[index], index+1};
            }
        }
        return new int[]{-1,-1};



    }

    static void swap(int[]nums, int first , int second){

        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]=temp;

    }

}