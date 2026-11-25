class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        
        Set<Long>temp = new HashSet<>();
        Set<String>x = new HashSet<>();
        int n = s.length();

        if(n<11){
            List<String>res = new ArrayList<>();           
            return res;
        }
        
        
        
        
        int base = 27;
        long mb = (long)Math.pow(base,9);
        long HashC = 0;

        for(int i = 0;i<10;i++){
            int value = s.charAt(i)-'A'+1;
            HashC = (HashC*base)+value;
        }
        temp.add(HashC);
        int left=0;
        int right = 10;

        while(right<n){
            long valL = s.charAt(left)-'A'+1;
            left++;
            long valR = s.charAt(right)-'A'+1;

            HashC = (HashC - valL*mb)*base+valR;
            if(temp.contains(HashC)){
                x.add(s.substring(left,right+1));
            }
            temp.add(HashC);
            right++;
        }    


        List<String>res = new ArrayList<>(x);
        
        return res;

    }
}