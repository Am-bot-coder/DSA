#include<iostream>
#include<vector>
using namespace std;

class Solution {
  public:
    int knapsack(int W, vector<int> &val, vector<int> &wt) {
        
        int n = val.size();
        
        vector<vector<int>>dp(n+1,vector<int>(W+1,0));
        
        if(W==0){
            return 0;
        }
        
        
        for(int i=1;i<n+1;i++){
            for(int w=1;w<W+1;w++){
                
                if(wt[i-1]>w){
                   dp[i][w] = dp[i-1][w];
                }
                else{
                    int pick  = val[i-1]+dp[i-1][w-wt[i-1]];
                    int unpick = dp[i-1][w];
                    dp[i][w] = max(pick,unpick);
                }
            }
        }
        
        return dp[n][W];
        
        
        
        
    }
};