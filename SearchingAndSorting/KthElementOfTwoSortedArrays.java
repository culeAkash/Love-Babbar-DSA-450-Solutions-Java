class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int i1 = 0,i2 = 0;
        
        while(i1<n && i2<m){
            int small = -1;
            
            if(arr1[i1]<=arr2[i2]){
                small = arr1[i1];
                i1++;
            }
            else{
                small = arr2[i2];
                i2++;
            }
            
            if(--k==0)
                return small;
            
        }
        
        while(i1<n){
            if(--k==0)
                return arr1[i1];
            i1++;
        }
        
        while(i2<m){
            if(--k==0)
                return arr2[i2];
            i2++;
        }
        
        return -1;
        
    }
}