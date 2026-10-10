//198.HouseRobber.cpp


// class Solution {
// public:
//     int rob(vector<int>& nums) {
//         int n = nums.size();
//         int dp[n+1];
//         memset(dp,-1,sizeof dp);

//         if(nums.size()==1){
//             return nums[0];
//         }
//         if(nums.size()==2){
//             return max(nums[0],nums[1]);
//         }

//         dp[0] = nums[0];
//         dp[1] = nums[1];
//         dp[2] = nums[0]+nums[2];

//         for(int i = 3;i<n;i++){
//             int temp1 = dp[i-2]+nums[i];
//             int temp2 = dp[i-3]+nums[i];
//             dp[i] = max(temp1,temp2);
//         }

//         return max(dp[n-1],dp[n-2]);


//     }
// };