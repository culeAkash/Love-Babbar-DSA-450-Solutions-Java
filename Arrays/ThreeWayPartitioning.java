class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b)
    {
        //Solve by using intuition of Sort 012
        int n = arr.length;
        int low = 0,high = n-1;
        int i = 0;
        while(i<=high){
            if(arr[i]<a){
                swap(arr,i,low);
                low++;
                i++;
            }
            else if(arr[i]>=a && arr[i]<=b){
                i++;
            }
            else{
                swap(arr,i,high);
                high--;
            }
        }
    }
    
    public void swap(int[] arr,int i,int j){
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}