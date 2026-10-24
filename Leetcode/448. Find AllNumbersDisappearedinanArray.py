class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        a = []
        s = set(nums)

        for i in range(1,len(nums)+1):
            if(i in s):
                continue
            else:
                a.append(i)
        return a
        