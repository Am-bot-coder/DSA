class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer>maps = new HashMap<>();
        int n = s.length();

        for(int i =0;i<n;i++){
            Character tx = s.charAt(i);
            int temp = maps.getOrDefault(tx,-1);
            if(temp!=-1){
                temp++;
				maps.put(tx, temp);
            }
            else{
                maps.put(tx,1);
            }
        }
        for(int i =0;i<n;i++){
            Character tx = t.charAt(i);
            int temp = maps.getOrDefault(tx,-1);
            if(temp!=-1){
                temp--;
				maps.put(tx, temp);
            }
            else{
                return false;
            }
        }

        return Collections.max(maps.values())==0?true:false;
        
    }
}