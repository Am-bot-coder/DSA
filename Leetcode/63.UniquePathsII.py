#63.UniquePathsII.py

class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        if(obstacleGrid[0][0]==1):
            return 0
        n = len(obstacleGrid)
        m = len(obstacleGrid[0])
        for i in range(n):
            for j in range(m):
                if(obstacleGrid[i][j]==1):
                    obstacleGrid[i][j] = -1
            
        
        obstacleGrid[0][0]=1
        for i in range(n):
            for j in range(m):
                if(obstacleGrid[i][j]==-1):
                    continue
                if(i==0 and j==0):
                    continue
                elif(i>0 and obstacleGrid[i-1][j]==-1):
                    obstacleGrid[i][j] = obstacleGrid[i][j-1]

                elif(j>0 and obstacleGrid[i][j-1]==-1):
                    obstacleGrid[i][j] = obstacleGrid[i-1][j]

                elif(i!=0 and j!=0):
                    obstacleGrid[i][j] = obstacleGrid[i-1][j]+obstacleGrid[i][j-1]

                elif(i!=0 and j==0):
                    obstacleGrid[i][j] = obstacleGrid[i-1][j]

                elif(i==0 and j!=0):
                    obstacleGrid[i][j] = obstacleGrid[i][j-1]
        
        if(obstacleGrid[n-1][m-1]==(-1)):
            return 0
        
        return obstacleGrid[n-1][m-1]



class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        if(obstacleGrid[0][0]==1):
            return 0
        n = len(obstacleGrid)
        m = len(obstacleGrid[0])
                
        dp = [[0]* m for _ in range(n)]
        dp[0][0] = 1
        for i in range(n):
            for j in range(m):
                if(obstacleGrid[i][j]==1):
                   dp[i][j]=0
                   continue

                if(i==0 and j==0):
                    continue
                
                if(i>0):
                    dp[i][j] += dp[i-1][j]
                if(j>0):
                    dp[i][j] += dp[i][j-1]                       
        
        return dp[n-1][m-1]



        