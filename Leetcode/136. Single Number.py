class Solution(object):
    def singleNumber(self, nums):
        res = 0
        for i in nums:
            res = res^i
        return res




#Java

# class Solution {
#     public int singleNumber(int[] nums) {
#         int res = 0;
#         for(int i :nums){
#             res ^= i;
#         }
#         return res;
#     }
# }