class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int m = matrix.length,n = matrix[0].length;
        
        while(i<m){
            if(target>=matrix[i][0] && target<=matrix[i][n-1]){
                return binarySearch(target,matrix[i]);
            }
            i++;
        }
        return false;
    }
    
    public boolean binarySearch(int target,int[] arr){
        int start = 0,end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
                return true;
            
            if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        
        return false;
    }
}