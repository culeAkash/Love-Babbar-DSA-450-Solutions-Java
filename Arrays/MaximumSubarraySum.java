class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        if(n==0){
            return 0;
        }
        
        long sum=0;
        long max= arr[0];
        
        for(int i=0;i<n;i++){
            sum+= arr[i];
            if(sum>max){
                max= sum;
            }
            
            if(sum<0){
                sum=0;
            }
        }
        return max;
        
        
    }
    
}