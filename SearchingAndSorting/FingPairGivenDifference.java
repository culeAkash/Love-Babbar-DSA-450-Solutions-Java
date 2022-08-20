class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        
        for(int i=0;i<size;i++){
            int k = arr[i] + n;
            
            int start = i + 1;
            int end = size-1;
            
            while(start<=end){
                int mid = start + (end-start)/2;
                
                if(arr[mid]==k)
                    return true;
                else if(arr[mid]<k)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }
}