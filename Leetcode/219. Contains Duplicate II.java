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




class Solution2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> window = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(window.get(nums[i])!=null){
                int j = window.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
            }
            window.put(nums[i],i);
        }
        return false;

    }
}