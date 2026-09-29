#include<iostream>
using namespace std;
#include<vector>
#include<set>

class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int flag = INT_MAX;
        int mtemp = 0;
        //sort(nums.begin(),nums.end());
        for(int i = 0;i<nums.size();i++){
            int left = i+1;
            int right = nums.size()-1;
            
            while(left<right){
                int temp = nums[i]+nums[left]+nums[right];
                if(temp==target){
                    return temp;
                }
                if(abs(target-temp)<flag){
                    flag = abs(target-temp);
                    mtemp = temp;
                }
                
                if(temp>target){
                    right--;
                }
                else if(temp<target){
                    left++;
                }
            }

        }
        
        return mtemp;
    }
};