#include<iostream>
using namespace std;
#include<vector>
#include<map>

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int>map;
        for(int i=0;i<nums.size();i++){
            int curr = nums[i];
            int x = target-curr;
            // if(map.contains(x)){
            //     return {map[x],i};
            // }
            // else{
            //     map[curr] = i;
            // }
        } 
        return {};
    }
    
};