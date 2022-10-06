class Solution
{
    //Function to find the largest number after k swaps.
    static String largest = "";
    public static String findMaximumNum(String str, int k)
        {
            largest = str;//assuming that str is largest
            helperFindMaximum(str.toCharArray(),str.length(),k,0);
            return largest;
        }
        
    static void helperFindMaximum(char[] nums,int N,int swapCount,int index){
        //check if string is consumed completely of swaps are exhausted
        if(swapCount== 0 || index>=N)
            return;
            
        char greatest = nums[index];
        int greatIndex = index;
        
        //check for largest character in the right of the index
        for(int k=index+1;k<N;k++){
            if(nums[k]>greatest){
                greatest = nums[k];
                greatIndex = k;
            }
        }
        
        //if character at index is itself the greatest no need to swap or do anything just recur for next index
        if(greatest==nums[index]){
            helperFindMaximum(nums,N,swapCount,index+1);//as no swaps are done swapCount is not reduced
            return;
        }
        
        //during finding the greatest to right we will get the first idx of the greatest character,
        //hence we have to look for other occurences to the right
        
        for(int i=greatIndex;i<N;i++){
            if(nums[i]==greatest){
                swap(nums,i,index);
                String newNum = new String(nums);
                if(newNum.compareTo(largest)>0)
                    largest = newNum;
                    
                helperFindMaximum(nums,N,swapCount-1,index+1);
                //backtrack
                swap(nums,i,index);
            }
        }
        
        
    }
    
    static void swap(char[] nums,int l,int r){
        char temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}