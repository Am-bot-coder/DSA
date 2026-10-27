class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int flag1 = 0;
        int flag2 = 0;
        List<Integer>res = new ArrayList<>();
        int i =0;
        int j =0;

        int y = 0;
        

        while(res.size()!=(matrix.length * matrix[0].length)){
            if(flag1==0 && flag2==0){
                if(j<(matrix[0].length - y)){
                    res.add(matrix[i][j]);
                    j++;
                }
                else{
                    flag2 = 1;
                    j--;
                    i++;
                }

            }
            else if(flag1==0 && flag2==1){
                if(i<(matrix.length - y)){
                    res.add(matrix[i][j]);
                    i++;
                }
                else{
                    i--;
                    j--;
                    flag1 = 1;
                }
            }
            else if(flag1==1 && flag2==1){
                if(j>=0+y){
                    res.add(matrix[i][j]);
                    j--;
                }
                else{
                    i--;
                    j++;
                    y++;
                    flag2 = 0;
                }
            }
            else if(flag1==1 && flag2==0){
                if(i>=0+y){
                    res.add(matrix[i][j]);
                    i--;
                }
                else{
                    i++;
                    j++;
                    flag1 = 0;
                }
            }
        }


        return res;

    }
}