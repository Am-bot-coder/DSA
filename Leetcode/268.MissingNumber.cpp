// class Solution(object):
//     def missingNumber(self, nums):
//         """
//         :type nums: List[int]
//         :rtype: int
//         """
//         return (sum(range(len(nums)+1)) - sum(nums))




#include<iostream>
using namespace std;
#include<vector>
#include<set>

class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        vector<int>v(n+1,-1);
        for(int i =0;i<nums.size();i++){
            v[nums[i]] = nums[i];
        }
        for(int i =0;i<v.size();i++){
            if(v[i]==-1)return i;
        }
        return 0;
    }
};

