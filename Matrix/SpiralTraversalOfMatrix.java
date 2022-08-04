class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int row, int col)
    {
        ArrayList<Integer> ans= new ArrayList<>();
        int row_start=0,row_end=row-1,col_start=0,col_end=col-1;
        int count=0;
        while(count<row*col)
        {
            for(int i=col_start;count<row*col && i<=col_end;i++)
            {
                ans.add(matrix[row_start][i]);
                count++;
            }
            row_start++;
            for(int j=row_start;count<row*col &&j<=row_end;j++)
            {
                ans.add(matrix[j][col_end]);
                count++;
            }
            col_end--;
            for(int i=col_end;count<row*col &&i>=col_start;i--)
            {
                ans.add(matrix[row_end][i]);
                count++;
            }
            row_end--;
            for(int j=row_end;count<row*col&&j>=row_start;j--)
            {
                ans.add(matrix[j][col_start]);
                count++;
            }
            col_start++;
        }
        return ans;
    }
}
