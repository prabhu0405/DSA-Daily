/*Given an array of integers nums sorted in non-decreasing order, 
find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int n = nums.length;
        int right = n-1;
        int left = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                first = mid;
                right = mid-1;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        left = 0;
        right = n-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                last = mid;
                left = mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return new int[]{first,last};
        
    }
}