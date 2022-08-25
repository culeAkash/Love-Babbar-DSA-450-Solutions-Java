class Solution
{
    int findNum(int n)
    {
        int start =0,end = Integer.MAX_VALUE;
        int ans = 0;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(isValid(mid,n))
            {
                ans = mid;
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        
        return ans;
    }
    
    boolean isValid(int mid,int n){
        int ans = 0;
        
        for(int i=5;i<=mid;i*=5){
            ans += mid/i;
        }
        
        if(ans>=n)
            return true;
        return false;
    }
}