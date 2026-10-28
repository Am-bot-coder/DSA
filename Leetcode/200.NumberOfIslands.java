class Solution {
    
    int res = 0;
    public void DFS(char[][] grid,int i,int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]==0){
            return;
        }

        grid[i][j] = 0;
        

        if(i<grid.length-1 && grid[i+1][j]=='1'){
            DFS(grid,i+1,j);
        }
        if( i>0 && grid[i-1][j]=='1'){
            DFS(grid,i-1,j);
        }
        if(j<grid[0].length-1 && grid[i][j+1]=='1'){
            DFS(grid,i,j+1);
        }
        if(j>0 && grid[i][j-1]=='1'){
            DFS(grid,i,j-1);
        }       

              

    }
    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    res++;
                    DFS(grid,i,j);
                }
            }
        }
        return res;
    }
}