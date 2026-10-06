#include<iostream>
#include<vector>
using namespace std;
//209.MinimumSizeSubarraySum.cpp  sum==target


int minSubArrayLen(int target, vector<int>& nums) {
        int sz = INT_MAX;
        int sum = 0;
        int left=0;
        int right = 0;

        while(right<=nums.size()&&left<=right){      
            
            if(sum>target){
                sum-=nums[left];
                left++;
                
            }
            else if(sum==target){
                int temp = right-left;
                sz = min(sz,temp);
                sum-=nums[left];
                left++;
            }
            else if(right == nums.size()){
                right++;
            }
            else if(sum<target){
                sum+= nums[right];
                right++;
            }
            
        }
        return sz==INT_MAX?0:sz;
    }

int main()
{
    vector<int>num1;
    num1.push_back(2);
    num1.push_back(3);
    num1.push_back(1);
    num1.push_back(2);
    num1.push_back(4);
    num1.push_back(3);
    int target = 7;
    cout<<minSubArrayLen(target,num1);
    return 0;
}
