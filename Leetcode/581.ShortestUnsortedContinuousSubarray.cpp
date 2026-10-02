#include<iostream>
using namespace std;
#include<vector>
// D:\DSA\Leetcode\581.ShortestUnsortedContinuousSubarray.cpp

class Solution {
public:
    int findUnsortedSubarray(vector<int>& nums) {
        

         if(nums.size()<=1){
            return 0;
        }

        int c = 0;
        int left = 0;
        int right = nums.size()-1;

        if(nums.size()==2){
            if(nums[left]>nums[right]){
                return 2;
            }
        }

        while(left<right){

            

            if(nums[left]<=nums[left+1] && nums[right]>=nums[right-1] && nums[left]<=nums[right]){
                left++;
                right--;
                ++c;
                c++;
            }
            else if(nums[left]>=nums[left+1] && nums[right]>=nums[right-1] && nums[left]<=nums[right]){
                right--;
                c++;
            }
            else if(nums[left]<=nums[left+1] && nums[right]<=nums[right-1] && nums[left]<nums[right]){
                left++;
                c++;
            }
            else if(nums[left]<nums[left+1] && nums[right]>nums[right-1] && nums[left]>nums[right]){
                return right-left+1;
            }
            else if(nums[left]>nums[left+1] && nums[right]>nums[right-1] && nums[left]>nums[right]){
                return right-left+1;
            }
            else if(nums[left]<nums[left+1] && nums[right]<nums[right-1] && nums[left]>nums[right]){
                return right-left+1;
            }
            else if(nums[left]>nums[left+1] && nums[right]<nums[right-1] && nums[left]<nums[right]){
                return right-left+1;
            }
            else if(nums[left]>nums[left+1] && nums[right]<nums[right-1] && nums[left]>nums[right]){
                return right-left+1;
            }
        }

    if(nums.size()%2 != 0){
        return nums.size()-c-1;
    }
    else{
        return nums.size()-c;
    }
    }
};