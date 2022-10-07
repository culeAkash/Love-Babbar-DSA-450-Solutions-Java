class Solution {
    static String res = "";
    static int K  = 0;
    public static String kthPermutation(int n,int k) {
        K = k;
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = i+1;
            
        String ansStr = "";
        helper(nums,ansStr,n,n);
        return res;
    }
    
    static void helper(int[] nums,String ansStr,int n,int count){
        if(count==0){
        if(K<0)
            return;
         
         K--;   
        if(K==0){
            res = ansStr;
        }
        return;
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                String ogAns = ansStr;
                ansStr += nums[i];
                nums[i] = 0;
                if(K>0)
                    helper(nums,ansStr,n,count-1);
                ansStr = ogAns;
                nums[i] = i+1;
            }
        }
        
    }
}
    