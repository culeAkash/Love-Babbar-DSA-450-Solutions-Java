class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        
        int finCount = 0;
        int resIndex = 0;
        for(int i=0;i<n;i++){
            int countOne = binarySearch(arr[i]);
            if(finCount<countOne){
                finCount = countOne;
                resIndex = i;
            }
        }
        return finCount == 0 ? -1 : resIndex;
    }
    
    public int binarySearch(int[] arr){
        int n = arr.length;
        int start = 0,end = n-1;
        int fin = n;
        while(start<=end){
            int mid = (start+end)/2;
            
            if(arr[mid]==1){
                fin = mid;
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        
        return n - fin;
    }
}