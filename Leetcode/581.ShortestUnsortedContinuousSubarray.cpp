#include<iostream>
using namespace std;
#include<vector>
// D:\DSA\Leetcode\581.ShortestUnsortedContinuousSubarray.cpp

class Solution {
public:
    int findUnsortedSubarray(vector<int>& nums) {
        int minValue = INT_MIN;
        int maxValue = INT_MAX;

        int left = 0;
        for(int i = 0;i<nums.size();i++){
            if(nums[i]<minValue){                
                left = i;
                
            }
            else{
                minValue = nums[i];
            }
        }
        int right = -1;
        // maxValue = nums[0];
        for(int i = nums.size()-1;i>=0;i--){
            if(nums[i]>maxValue){                
                right = i;
                
            }
            else{
                maxValue = nums[i];
            }
        }

        return right == -1?0:left-right+1;

    }
};