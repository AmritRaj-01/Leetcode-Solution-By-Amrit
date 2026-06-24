class Solution {
    public boolean helper(int [][]grid,int rows,int col,int num){
        int n=grid.length;
        if(grid[rows][col]==n*n-1) return true;
        int i,j;
        // 8 condition
        // 2 Up 1 right , 2 Up 1 left
        i=rows-2;
        j=col+1;
        if(i>=0 && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);

        i=rows-2;
        j=col-1;
        if(i>=0 && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);

        // 2 down 1 right , 2 down 1 left
        i=rows+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);

        i=rows+2;
        j=col-1;
        if(i<n && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);

        // 2 right 1 Up , 2 right 1 down
        i=rows-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);

        i=rows+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        // 2 left 1 Up , 2 left 1 down
        i=rows-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);

        i=rows+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);

        return false;

    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        return helper(grid,0,0,0); //(grid,rows,col,num)
    }
}