class Solution {
    public int firstUniqChar(String s) {
        ArrayList<Character> arr = new ArrayList<>();
		ArrayList<Integer> freq = new ArrayList<>();
		
		
		for(int i=0;i<s.length();i++) {
			if(arr.contains(s.charAt(i))) {
				int idx = arr.indexOf(s.charAt(i));
				int value = freq.get(idx);
				freq.set(idx,++value);
			}
			else {
				arr.add(s.charAt(i));
				freq.add(1);
			}
		}
		
		int idx = freq.indexOf(1);
        if(idx!=-1){
            int val = arr.get(idx);
            for(int i=0;i<s.length();i++){
                if(val==s.charAt(i)){
                    return i;
                }
            }
        }

        return idx;
    }
}