#include<iostream>
#include<vector>
using namespace std;

class Solution1 {
public:
    int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        
        vector<int>dp(n+1,-1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        
        if(n<3){
            return dp[n];
        }
        
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }

        return dp[n];

    }
};


//python-->
// class Solution(object):
//     def tribonacci(self, n):
//         a = 0
//         b = 1
//         c = 1
//         if(n==0):
//             return a
//         if(n<3):
//             return b
//         for i in range(3,n+1):
//             a,b,c = b,c,a+b+c
//         return c
        