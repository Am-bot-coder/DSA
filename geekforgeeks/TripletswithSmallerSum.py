class Solution:
    def countTriplets(self, sum, arr):
        arr.sort()
        count = 0
        thisset = set()
        for i in range(len(arr)):
            left = i+1;
            right = len(arr)-1
            
            while(left<right):
                temp = arr[i]+arr[left]+arr[right]
                
                if(temp<sum):
                    count = count+(right-left)
                    left = left+1
                elif(temp>=sum):
                    right = right-1
                
                    
                    
                
                
        return len(thisset)+count
                
            
            
        