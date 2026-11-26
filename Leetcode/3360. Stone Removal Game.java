class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }              
        else{
            int x = 0;
            int stone = 10;
            while(stone>=0){                
                if(n<stone){
                    break;
                }                
                n = n-stone;
                x = x^1;
                stone--;           
                
            }

            if(x==0){
                return false;
            }
            else{
                return true;
            }
        }
    }
}