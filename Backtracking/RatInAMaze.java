class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> res = new ArrayList<>();
        
        helper(res,m,n,"",0,0);
        return res;
    }
    
    public static void helper(ArrayList<String> res,int[][] matrix,int n,String s,int row,int col){
        if(row<0 || col<0 || row>=n || col >=n || matrix[row][col]!=1)
            return;
            
        if(row==n-1 && col == n-1){
            res.add(s);
            return;
        }
        
        matrix[row][col] = -1;//visited
            
        helper(res,matrix,n,s+"U",row-1,col);
        helper(res,matrix,n,s+"D",row+1,col);
        helper(res,matrix,n,s+"R",row,col+1);
        helper(res,matrix,n,s+"L",row,col-1);
        
        matrix[row][col] = 1;
        
        
    }
}