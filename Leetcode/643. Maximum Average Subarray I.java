class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k;
        int sum = 0;

        int n = nums.length;
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }
        int temp = sum;
        while(right<n){         
            temp+=nums[right];
            temp-=nums[left];
            
            if(temp>sum){
                sum=temp;
            }
            right++;
            left++;
        }

        return (double)sum/k;
    }
}