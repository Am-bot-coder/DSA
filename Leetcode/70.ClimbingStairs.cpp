#include<iostream>
using namespace std;

class Solution {
public:
    int climbStairs(int n) {
    if(n<=1){
        return n;
    }
     long dp[10]; //10=n
     memset(dp,-1,sizeof dp);
     dp[0] = 2;
     dp[1] = 3;
     for(int i = 2;i<n;i++){
        dp[i] = dp[i-1]+dp[i-2];
     }
     return dp[n-2];
    }
};