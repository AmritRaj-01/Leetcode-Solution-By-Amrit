class Solution {
    private  boolean isSafe(char[][] board, int row, int col) {
        int n=board.length;
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        for (int i = 0; i < n; i++) {
            if (board[i][col]=='Q') return false;
        }
        //check north east
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        // check south east
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        // south west
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        // north west
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;

    }

    private void nQueen(char[][] board, int row,List<List<String>> ans) {
        int n=board.length;
        if(row==n){ // base case
            // converting 2-D array into list of String 
            List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=board[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return ;
        }

        for (int j = 0; j <n ; j++) { // call and backtrack
            if(isSafe(board,row,j)) {
                board[row][j]='Q';
                nQueen(board,row+1,ans);
                board[row][j]='.';
            }
        }
    }

    public int totalNQueens(int n) {
        char[][]board=new char[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<>();
        nQueen(board,0,ans);
        return ans.size();
    }
}