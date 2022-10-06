import java.util.* ;
import java.io.*; 
public class Solution {
    static int maximum = 0;
    static int sum = 0;
    public static int longestPath(int n, int m, int[][] matrix, int startX, int startY, int destX, int destY) {
        if(matrix[startX][startY]==0)
            return -1;
        maximum = 0;
        int dirX[] = {0,1,0,-1};
        int dirY[] = {1,0,-1,0};
        sum = 0;
        if(pathPossible(matrix,n,m,startX,startY,destX,destY,dirX,dirY))
            return maximum;
        return -1;
    }
    
    static boolean pathPossible(int[][] matrix,int n,int m,int startX,int startY,int destX,int destY,int[] dirX,int[] dirY){
        if(startX==destX && startY==destY)
            return true;
        
        matrix[startX][startY] = 0;
        sum++;
        boolean pos = false;
        for(int i=0;i<4;i++){
            int x = startX + dirX[i];
            int y = startY + dirY[i];
            
            if(isValid(matrix,x,y)){
                if(pathPossible(matrix,n,m,x,y,destX,destY,dirX,dirY)){
                    if(sum>maximum)
                        maximum = sum;
                    pos = true;
                }
            }     
    }
        matrix[startX][startY] = 1;
        sum--;
            return pos;
    }
    
    static boolean isValid(int[][] matrix,int x,int y){
        return (x>=0 && x<matrix.length && y>=0 && y<matrix[0].length && matrix[x][y]!=0);
    }
}