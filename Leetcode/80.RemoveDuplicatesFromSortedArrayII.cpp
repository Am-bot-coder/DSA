#include<iostream>
#include<vector>
#include<map>

using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int left = 0;
        int right = 1;
        int flag = 0;

        while(right<nums.size()){
            if(flag==0 && nums[left]==nums[right]){
                flag = 1;
                right++;
            }
            else if(flag==1 && nums[left]==nums[right]){
                nums.erase(nums.begin()+right);
            }
            else if(nums[left]!=nums[right]){
                left=right;
                right++;
                flag = 0;
            }            
        }
        return nums.size();
    }
};



class Solution2 {
public:
    int removeDuplicates(vector<int>& nums) {
        map<int,int>maps;
        map<int,int>::iterator it;
        
        for(int i = 0;i<nums.size();i++){
            maps[nums[i]]=0;
        }

        for(int i = 0;i<nums.size();i++){
            if(maps[nums[i]]<2){
                maps[nums[i]]++;
            }
        }
        nums.clear();
        for(it=maps.begin();it!=maps.end();++it){
            for(int i=0;i<it->second;i++){
                nums.push_back(it->first);
            }
        }

    return nums.size();
    }
};