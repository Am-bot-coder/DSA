class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = k-1;
        int n = cardPoints.length;
        int right = n-1;

        int sum = 0;

        for(int i = 0;i<k;i++){
            sum+=cardPoints[i];
        }
        int temp = sum;
        while(left>-1){            
            temp-=cardPoints[left];
            left--;
            temp+=cardPoints[right];
            right--;

            if(temp>sum){
                sum=temp;
            }
            
        }

        return sum;


    }
}