class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = 0;
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right = mid-1;
                idx = mid;
            }
            else{
                left = mid+1;
                idx = mid+1;
            }
        }
        return idx;
    }
}