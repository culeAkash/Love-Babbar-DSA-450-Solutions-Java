class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int nums[], int n, int X) { 
        
        Arrays.sort(nums);
        int flag = 1;
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int low = i+1,
                high = nums.length-1,
                target = X - nums[i];
                
                while(low<high){
                    if(nums[low]+nums[high]==target)
                         return true;
                    else if(nums[low]+nums[high]<target)
                        low++;
                    else
                        high--;
                }
            }
            
        
        }
        return false;
        }
}
