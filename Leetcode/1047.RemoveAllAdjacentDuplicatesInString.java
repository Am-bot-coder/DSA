class Solution {//optimal
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int n = stack.length();

            if (n > 0 && stack.charAt(n - 1) == c) {
                stack.deleteCharAt(n - 1);
            } else {
                stack.append(c);
            }
        }

        return stack.toString();
    }
}


class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        int i =0;

        
        while(i<str.length()-1 && str.length()>0){
            if(str.charAt(i)==str.charAt(i+1)){
                str.deleteCharAt(i);
                str.deleteCharAt(i);

                if(i>0){
                    i--;
                }             
            }
            else{
                i++;
            }
        }
        return str.toString();
    }
}