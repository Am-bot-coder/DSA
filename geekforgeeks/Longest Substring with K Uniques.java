
class Solution {
    public int longestKSubstr(String s, int k) {
        ArrayDeque<Character> Q = new ArrayDeque<>();

        int sz = 0;
        int i = 0;
        int count = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);

            if (!Q.contains(ch)) {
                count++;
            }

            Q.offer(ch);

            while(count>k){
                char z = Q.poll();
                if(!Q.contains(z)){
                    count--;
                }
            }
            

            if (count == k) {
                sz = Math.max(sz, Q.size());
            }

            i++;
        }

        return sz > 0 ? sz : -1;
    }
}
