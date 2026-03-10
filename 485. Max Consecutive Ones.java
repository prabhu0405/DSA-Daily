/*Given a binary array nums, return the maximum number of consecutive 1's in the array. */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int count = 0;
        int storeCount = 0;

        for(int i = 0; i<len; i++){
            if(nums[i] == 1){
                count++;
                 if(storeCount < count){
                    storeCount = count;
                 }
            }
            else{
                count = 0;
            }
                    
            
        }
        return storeCount;
    }
}