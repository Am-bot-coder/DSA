#include<iostream>
using namespace std;
#include<vector>

int removeDuplicates(vector<int>& nums) {
        int left = 0;
        int right = 1;
        int _;

        while(right<nums.size() && nums[right]!=_){
            if(nums[left]==nums[right]){
                nums.erase(nums.begin()+right);                
                nums.push_back(_);
            }
            else{
                left = right;
                right++;
            }
        }
        int k = nums.size()-count(nums.begin(),nums.end(),_);
        return k;
    }

int main()
{
    vector<int> v1;
    v1.push_back(1);
    v1.push_back(1);
    v1.push_back(2);
    int k = removeDuplicates(v1);

    for(int x:v1){
        cout<<x<<endl;
    }
    return 0;
}
