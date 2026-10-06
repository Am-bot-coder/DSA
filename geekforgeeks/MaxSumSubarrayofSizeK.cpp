#include<iostream>
#include<vector>
using namespace std;

class Solution {
  public:
    int maxSubarraySum(vector<int>& arr, int k) {
        int sum = 0;
        int left = 0;
        int right = 0;
        int temp = 0;
        
        while(right<k){
            temp+=arr[right];
            right++;
        }
        sum = max(sum,temp);
        
        
        while(right<arr.size()){
            temp-=arr[left];
            left++;
            temp+=arr[right];
            sum = max(sum,temp);
            right++;
        }
        return sum;
        
    }
};