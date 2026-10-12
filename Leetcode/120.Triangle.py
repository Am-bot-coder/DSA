class Solution(object):
    def minimumTotal(self, triangle):
        """
        :type triangle: List[List[int]]
        :rtype: int
        """

        n = len(triangle)
        sum =0
        if(n==0):
            return 0
        if(n==1):
            return triangle[0][0]
        dp = [[0] * i for i in range(1,n+1)]       
        dp[0][0] = triangle[0][0]

        n = len(triangle)
        for i in range(n):
            for j in range(i+1):
                if(i==0 and j==0):
                    continue
                elif(i>0 and j>0 and j!=i):
                    dp[i][j] = min(dp[i-1][j],dp[i-1][j-1])+triangle[i][j]
                elif(i>0 and j>0 and j==i):
                    dp[i][j] =dp[i-1][j-1]+triangle[i][j]
                elif(i>0 and j!=i):
                    dp[i][j] =dp[i-1][j]+triangle[i][j]
        minsum = float('inf')
        for i in range(n):
            minsum = min(minsum,dp[n-1][i])
        return minsum

            

        

class Solution:
    def minimumTotal(self, triangle):
        dp = triangle[-1][:]

        for i in range(len(triangle) - 2, -1, -1):
            for j in range(len(triangle[i])):
                dp[j] = triangle[i][j] + min(
                    dp[j], dp[j + 1]
                )

        return dp[0]