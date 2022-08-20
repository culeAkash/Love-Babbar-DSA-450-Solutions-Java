class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        long count = 0;
        
        for(int i=0;i<n-2;i++){
            
            long target = sum - arr[i];
            
            int start = i + 1;
            int end = n-1;
            
            while(start<end){
                
                long t = arr[start] + arr[end];
                
                if(t<target){
                    count += (end-start) ;
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return count;
    }
}