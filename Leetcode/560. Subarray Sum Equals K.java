class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        
        int n = nums.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum += nums[j];

                if(sum==k){
                    res++;
                }
                
            }
        }
        
        return res;
    }
}



class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer>maps = new HashMap<>();
        maps.put(0,1);

        int n = nums.length;
        int res = 0;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            res+=maps.getOrDefault(sum-k,0);
            maps.put(sum,maps.getOrDefault(sum,0)+1);
        }       
        
        return res;
    }
}