#include<iostream>
using namespace std;

// class Solution {
// public:
//     int minCostClimbingStairs(vector<int>& cost) {
//         int n = cost.size();
//         int dp[n+1];
//         memset(dp,-1,sizeof dp);

//         dp[0] = cost[0];
//         dp[1] = cost[1];

//         for(int i = 2;i<n;i++){
//             int temp1 = dp[i-1] + cost[i];
//             int temp2 = dp[i-2] + cost[i];
//             dp[i] = min(temp1,temp2);    
           
//         }
//         return min(dp[n-2],dp[n-1]);

//     }
// };