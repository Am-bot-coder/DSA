#include<iostream>
using namespace std;
#include<vector>

class Solution {
public:
    int maxProfit(vector<int>& prices) {
       int mp = prices[0];
       int n = prices.size();
       int maxV = 0;

       for(int i = 0;i<n;i++){
         mp = min(mp,prices[i]);
         int temp = prices[i]-mp;
         maxV = max(maxV,temp);
       }

    
       return maxV;
    }
};




//java
// class Solution {
//     public int maxProfit(int[] prices) {
//         int mp = 0;
//         int mb = Integer.MAX_VALUE;

//         for(int i=0;i<prices.length;i++){
//             mb = Integer.min(mb,prices[i]);
//             mp = Integer.max(mp,prices[i]-mb);
//         }




//         return mp;
//     }
// }