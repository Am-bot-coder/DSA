#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int left = 0;
        int right = 0;
        vector<int> nums2;
        if(nums.size()==1){
            int temp = nums[0]*nums[0];
            nums2.push_back(temp);
            return nums2;
        }
        for(int i = 0;i<nums.size();i++){
            if(nums[i]>=0){
                left = i;
                
                break;
            }
            if(i==(nums.size()-1)){
                left = i+1;
            }
        }

        if(left == 0){
            for(int i = 0;i<nums.size();i++){
                int temp = nums[i]*nums[i];
                nums2.push_back(temp);
            }
            return nums2;
        }
        else if(left == nums.size()){
            for(int i = (nums.size()-1);i>=0;i--){
                int temp = nums[i]*nums[i];
                nums2.push_back(temp);
            }
            return nums2;
        }
        else{
            left--;
            right = left+1;
            while(left>=0 && right<nums.size()){
                int templ = nums[left]*nums[left];
                int tempr = nums[right]*nums[right];

                if(templ<=tempr){
                    nums2.push_back(templ);
                    left--;
                }
                else if(tempr<templ){
                    nums2.push_back(tempr);
                    right++;
                }
            }
        }
        while(left>=0){
                int templ = nums[left]*nums[left];
                nums2.push_back(templ);
                left--;
            }
        
        while(right!=nums.size()){
                int tempr = nums[right]*nums[right];
                nums2.push_back(tempr);
                right++;
            }

        return nums2;

    }
};