class Solution {
    public int repeatedStringMatch(String a, String b) {


        if(a.equals(b)){
            return 1;
        }


        int n = a.length();
        int m = b.length();
        int res = 0;
        
        int base = 31;
        long mod  = 1_000_000_007L;
        long hashB = 0;
        for(int i=0;i<m;i++){
            long val = b.charAt(i)-'a'+1;
            hashB = (hashB*base+val)%mod;
        }

        long hashA = 0;
        int right = 0;
        int left = 0;
        
        long power = 1;

        for (int i = 0; i < m; i++) {
            power = (power * base) % mod;
        }

        while(right<m+n-1){
            
            long ingoing = a.charAt(right%n)-'a'+1;
            hashA = (hashA*base+ingoing)%mod;
            if(right-left+1>m){
                long outgoing = a.charAt(left%n)-'a'+1;
                left++;
                hashA = (hashA - (outgoing*power)%mod + mod)%mod;
            }
            if (right - left + 1 == m && hashA == hashB) {
                return right / n + 1;
            }
            right++;
            

        }



        return -1;

        
    }
}