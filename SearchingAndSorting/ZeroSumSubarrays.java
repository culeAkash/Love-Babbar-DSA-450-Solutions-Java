class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        long count = 0;
        
        Map<Long,Long> map = new HashMap<>();
        map.put(0l,1l);
        
        
        long sum = 0;
        
        for(int i=0;i<n;i++){
            sum += arr[i];
                
            if(map.containsKey(sum)){
                long k = map.get(sum);
                count+= k++;
                map.put(sum,k);
            }
            else
                map.put(sum,1l);
        }
        
        return count;
    }
}