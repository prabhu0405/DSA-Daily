/*You are given a 0-indexed integer array nums of even length consisting of an equal number 
of positive and negative integers.

You should return the array of nums such that the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions. */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        int j = 0;
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                neg[k] = nums[i];
                k = k+1;
           
            }
            else{
                pos[j] = nums[i];
                j = j +1;  
            }
        }
        j = 0;
        k = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            nums[i] = pos[j];
            nums[i+1] = neg[k];
            j++;
            k++;
        }
        return nums;
}
    }
    