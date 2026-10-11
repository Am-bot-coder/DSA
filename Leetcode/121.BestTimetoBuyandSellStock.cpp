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