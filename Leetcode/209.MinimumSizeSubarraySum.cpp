#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int sz = INT_MAX;
        int sum = 0;
        int left=0;
        int right = 0;

        for(right;right<nums.size();right++){
            sum+=nums[right];
            while(sum>=target){
                int temp = right-left+1;
                sz = min(temp,sz);
                sum-=nums[left];
                left++;
            }
        }
        return sz==INT_MAX?0:sz;
    }
};