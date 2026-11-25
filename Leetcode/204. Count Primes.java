//204. Count Primes

class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean c[] = new boolean[n];
        Arrays.fill(c,true);
        int cnt = n-2;
        for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<n;j=j+i){
                if(j%i==0){
                    if(c[j]==true){
                        cnt--;
                    }
                    c[j]=false;
                    
                }
            }
        }

        
        return cnt;
    }
}