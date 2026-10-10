#include<iostream>
using namespace std;
class Solution {
public:
    int fib(int n) {
    if(n<=1){
         return n;
    }
    
   // int dp[n+1];
   int dp[10]; //ignore it
    memset(dp,-1,sizeof dp);
    dp[0] = 0;
    dp[1] = 1;
    for(int i = 2;i<=n;i++){
        dp[i] = dp[i-1]+dp[i-2];
    } 
    return dp[n];    
    }
};