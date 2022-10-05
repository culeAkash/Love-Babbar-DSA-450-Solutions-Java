class Solution{
    static ArrayList<ArrayList<Integer>> res;
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        int[][] board = new int[n][n];
        
        solve(ans,n,0,board);
        return res;
    }
    
    static void solve(ArrayList<Integer> ans,int n,int row,int[][] board){
        if(row==n)
        {
            res.add(new ArrayList<Integer>(ans));
            return;
        }
        
        for(int i=0;i<n;i++){
            if(isSafe(row,i,board)){
                ans.add(i+1);
                board[row][i] = 1;
                solve(ans,n,row+1,board);
                board[row][i] = 0;
                ans.remove(ans.size()-1);
            }
        }
        
    }
    
    static boolean isSafe(int row,int col,int[][] board){
        int r = row,c = col;
        
        while(r>=0){
            if(board[r][c]==1)
                return false;
            r--;
        }
        
        r= row;
        c = col;
        while(r>=0 && c>=0){
            if(board[r][c]==1)
                return false;
            r--;
            c--;
        }
        
        r= row;c = col;
        while(r>=0 && c<board.length){
            if(board[r][c]==1)
                return false;
            r--;
            c++;
        }
        
        return true;
    }
}