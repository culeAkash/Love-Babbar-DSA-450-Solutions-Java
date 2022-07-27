
class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+= arr[i];
            if(sum==0)
                return true;
            
            if(map.containsKey(sum))
                return true;
                
            map.put(sum,i);
        }
        return false;
    }
}