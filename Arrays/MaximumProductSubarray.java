class Solution {
    public int maxProduct(int[] nums) {
        int n  = nums.length;
        if(n==0)
            return 0;
        
        int max = Integer.MIN_VALUE;
        int prod = 1;
        for(int i=0;i<n;i++){
            prod *= nums[i];
            max = Math.max(prod,max);
            if(prod==0)
                prod = 1;
        }
        
        prod = 1;
        for(int i=n-1;i>=0;i--){
            prod *= nums[i];
            max = Math.max(prod,max);
            if(prod==0)
                prod = 1;
        }
        
        return max;
    }
}