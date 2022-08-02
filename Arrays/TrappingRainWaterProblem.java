
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        if(n==0)
        return 0;
        long leftMax = 0,rightMax=0;
        long water= 0;
        n--;
        for(int i=0;i<n;){
            if(arr[i]<arr[n]){
                if(arr[i]>=leftMax)
                leftMax = arr[i];
                else
                water += leftMax-arr[i];
                i++;
            }
            else{
                if(arr[n]>=rightMax)
                rightMax = arr[n];
                else
                water += rightMax - arr[n];
                n--;
            }
        }
        return water;
    } 
}