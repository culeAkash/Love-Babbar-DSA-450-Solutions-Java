class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        if(nums.length<=1)
            return 0;
            
        Pair[] pairs = new Pair[nums.length];
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            pairs[i] = new Pair(nums[i],i);
        }
        
        Arrays.sort(pairs,new Comp());
        
        int swapCount = 0;
        
        for(int i=0;i<n;){
            if(i==pairs[i].index){
                i++;
                continue;
            }
            else{
                Pair temp = pairs[pairs[i].index];
                pairs[pairs[i].index] = pairs[i];
                pairs[i] = temp;
                swapCount++;
            }
        }
        return swapCount;
    }
}

class Pair{
    int num;
    int index;
    
    public Pair(int n,int i){
        num = n;
        index = i;
    }
}

 class Comp implements Comparator<Pair>{
     public int compare(Pair p1,Pair p2){
         return p1.num - p2.num;
     }
 }