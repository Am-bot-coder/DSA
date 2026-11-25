class Solution {
    public int strStr(String haystack, String needle) {
        long base = 2;
        int h = haystack.length();
        int n = needle.length();

        if(n>h){
            return -1;
        }



        long hashN = 0;
        for(int i=0;i<n;i++){
            int value = needle.charAt(i) - 'a'+1;
            hashN = hashN*base+value;
            
        }

        long hashH=0;
        for(int i=0;i<n;i++){
            int value = haystack.charAt(i) - 'a'+1;
            hashH = hashH*base+value;
        }
        

        if(hashH==hashN){
            return 0;
        }
        int left = 0;
        int right = n;

        long mb = (long)Math.pow(base,n-1);

        while(right<h){
            int lval = haystack.charAt(left) - 'a'+1;
            left++;
            int value = haystack.charAt(right) - 'a'+1;
            
            hashH = (hashH-lval*mb)*base + value;

            if(hashN==hashH){
                return left;
            }
            right++;
        }    



        return -1;
    }
}




//===============================================================================>

class Solution {
    public int strStr(String haystack, String needle) {
        int i =0;
        int j = needle.length();
        int h = haystack.length();

        while(j<=h){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}