class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       
        int right = 0;
        HashSet<Integer> window = new HashSet<>();


        if(nums.length == 0 || k==0){
            return false;
        }

        
        window.add(nums[right]);
        while(right<nums.length-1){
            right++;
            if(window.contains(nums[right])){
                    return true;
            }
            window.add(nums[right]);
            if(window.size()>k){
                window.remove(nums[right-k]);
            }
           
        }
        return false;
    }
}