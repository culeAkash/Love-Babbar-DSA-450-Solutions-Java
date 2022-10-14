class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        Queue<Triplet> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    queue.offer(new Triplet(i,j,0));
                    visited[i][j] = true;
                }
            }
        }
        
        int distX[] = {1,-1,0,0};
        int distY[] = {0,0,1,-1};
        while(!queue.isEmpty()){
            int row = queue.peek().row;
            int col = queue.peek().col;
            int d = queue.peek().dist;
            queue.poll();
            grid[row][col] = d;
            
            for(int i=0;i<4;i++){
                int r = row + distX[i];
                int c = col + distY[i];
                
                if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c]==0 && !visited[r][c]){
                    visited[r][c] = true;
                    queue.offer(new Triplet(r,c,d+1));
                }
            }
        }
        return grid;
    }
}

class Triplet{
    int row;
    int col;
    int dist;
    
    public Triplet(int r,int c,int d){
        row = r;
        col = c;
        dist = d;
    }
}