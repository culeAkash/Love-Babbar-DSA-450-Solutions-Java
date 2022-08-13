class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length==0)
            return;
        
        //converting to transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp  = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //reversing each row
        for(int i=0;i<matrix.length;i++){
            int start=0, end = matrix.length - 1;
            while(start<end){
                int temp = matrix[i][start];
                matrix[i][start++] =  matrix[i][end];
                matrix[i][end--] = temp;
                
            }
        }
        
    }
}