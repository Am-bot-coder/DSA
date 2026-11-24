class Solution {
    public int maxLength(int[] nums) {

        int left = 0;
        int right = 1;
        int maxLen = 0;

        int product = 1;
        int lcmVar = 1;
        int gcdVar = 1;

        product = product*nums[left];
        product = product*nums[right];
        
        gcdVar = GCD(nums[left],nums[right]);
        lcmVar = LCM(nums[left],nums[right]);
        while(right<nums.length && left<=right){
            
            while(product>gcdVar*lcmVar){
                product = product/nums[left];
                left++;
                gcdVar = nums[left];
                lcmVar = nums[left];
                for(int i = left + 1; i <= right; i++){
                    gcdVar = GCD(gcdVar, nums[i]);
                    lcmVar = LCM(lcmVar, nums[i]);
                }                


            }
            if(product==gcdVar*lcmVar){
                int temp = right-left+1;
                if(temp>maxLen){
                    maxLen = temp;
                }
                
            }
            right++;
            if(right<nums.length){
                product*=nums[right];
                gcdVar = GCD(gcdVar,nums[right]);
                lcmVar = LCM(lcmVar,nums[right]);
            }
            
        }


        return maxLen;
        
    }

    public int GCD(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return GCD(num2,num1%num2);

    }

    public int LCM(int num1,int num2){
        return (num1 / GCD(num1, num2)) * num2;
    }
}