class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        a = []
        for i in range(0,len(nums)):
            b = 0
            for j in range(0,len(nums)):
                if(nums[i]>nums[j]):
                    b+=1
            a.append(b)
        return a


class Solution2(object):
    def smallerNumbersThanCurrent(self, nums):
        temp = sorted(nums)
        s = {}
        a = []
        for i,num in enumerate(temp):
            if num not in s:
                s[num] = i
        for i in nums:
            a.append(s[i])
        return a
        