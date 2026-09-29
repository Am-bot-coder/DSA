#include<iostream>
using namespace std;
#include<vector>
#include<set>

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>>v1;
        
        //sort(nums.begin(),nums.end()); //neeed c++ new version

        for(int i=0;i<nums.size();i++){
        int left = i+1;
        int right = nums.size()-1;

        if(i>0 && nums[i]==nums[i-1])
            continue;

        while(left<right){
            
            if(-1 * nums[i] == nums[left]+nums[right]){   
                vector<int>tempv;
                
                tempv.push_back(nums[i]);
                tempv.push_back(nums[left]);
                tempv.push_back(nums[right]);
                v1.push_back(tempv);                   
                while(left<right && (nums[left]==nums[left+1])){
                    left++;
                };
                while(left<right && (nums[right]==nums[right-1])){
                    right--;
                };
                left++; 
                right--;
            }
            else if(-1 * nums[i] > nums[left]+nums[right]){
                left++;
            }
            else if(-1 * nums[i] < nums[left]+nums[right]){
                right--;
            }
        }

        }
        return v1;
    }
};




class Solution2 {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>>v1;
        set<set<int>>s1;//for checking wheather the condition is true or not
        // sort(nums.begin(),nums.end());

        for(int i=0;i<nums.size();i++){
        int left = i+1;
        int right = nums.size()-1;

        while(left<right){
            if(-1 * nums[i] == nums[left]+nums[right]){   
                vector<int>tempv;
                set<int>temps;
                tempv.push_back(nums[i]);
                tempv.push_back(nums[left]);
                tempv.push_back(nums[right]);

                temps.insert(nums[i]);
                temps.insert(nums[left]);
                temps.insert(nums[right]);
                            
                // if(!s1.contains(temps)){
                //     v1.push_back(tempv);
                //     s1.insert(temps);
                // }
                
                
                while(left<right && (nums[left]==nums[left+1])){
                    left++;
                };
                left++; 
            }
            else if(-1 * nums[i] > nums[left]+nums[right]){
                left++;
            }
            else if(-1 * nums[i] < nums[left]+nums[right]){
                right--;
            }
        }

        }
        return v1;
    }
};