class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long product = 1;
        long[] ans = new long[n];
        
        int countZeros = 0;
        int index = -1;
        
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                product *= nums[i];
            }
            else{
                index = i;
                countZeros++;
            }
        }
        
        if(countZeros>1){
            return ans;
        }
        else{
            if(countZeros==1){
                ans[index] = product;
                return ans;
            }
            else{
                for(int i=0;i<n;i++){
                    ans[i] = product/nums[i];
                }
            }
        }
        
        return ans;
	} 
} 
