#include<iostream>
#include<vector>
using namespace std;

// class Solution {
//   public:
//     bool isSubsetSum(vector<int>& arr, int sum) {
        
//         if(sum==0){
//             return true;
//         }
//         int n = arr.size();
//         int dp[n+1][sum+1];
//         memset(dp,0,sizeof dp);
        
//         for(int i=0;i<=n;i++){
//             dp[i][0] = 1;
//         }
//         for(int j=1;j<=sum;j++){
//             dp[0][j] = 0;
//         }
        
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=sum;j++){
                
//                 if(arr[i-1]>j){
//                     dp[i][j] = dp[i-1][j];
                    
//                 }
//                 else{
//                     bool pick = dp[i-1][j-arr[i-1]];
//                     bool unpick = dp[i-1][j];
                    
//                     dp[i][j] = pick||unpick;
//                 }
//             }
//         }
        
        
//         return dp[n][sum];
        
        
        
//     }
// };