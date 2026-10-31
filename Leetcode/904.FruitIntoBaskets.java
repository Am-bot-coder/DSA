class Solution {
    public int totalFruit(int[] fruits) {
        ArrayDeque<Integer> m = new ArrayDeque<>();
        int count = 0;
        int res = 0;

        for(int i=0;i<fruits.length;i++){
            
            if(!m.contains(fruits[i])){
                count++;
            }
            m.offer(fruits[i]);
            if(count<=2 && count>0 ){
                res = Math.max(res,m.size());
            }
            if(count>2){
                while(count>2){
                    int temp = m.poll();
                    if(!m.contains(temp)){
                        count--;
                    }
                }
            }
        }
        return res;


        
    }
}