#include<iostream>
using namespace std;
#include<vector>
#include<set>

// class Solution {
// public:
//     bool containsDuplicate(vector<int>& nums) {
//         set<int>s;
//         for(int i=0;i<nums.size();i++){
//             if(s.contains(nums[i])){
//                 return true;
//             }
//             else{
//                 s.insert(nums[i]);
//             }
//         }

//         return false;
//     }
// };



//JAVA
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer>s = new HashSet<>();
//         for(int x:nums){
//             if(s.contains(x)){
//                 return true;
//             }
//             s.add(x);
//         }
//         return false;
//     }
// }


//python
// class Solution(object):
//     def containsDuplicate(self, nums):       
//         s = set()
//         for i in nums:
//             if(i in s):
//                 return True
//             s.add(i)
//         return False
        

