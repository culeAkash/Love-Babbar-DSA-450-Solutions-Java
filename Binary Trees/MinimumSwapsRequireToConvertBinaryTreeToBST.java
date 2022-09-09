class Solution {
    public static int minSwaps(int n, int[] A) {
        if(A.length<=1)
            return 0;
        List<Integer> nums = new ArrayList<>();
        inorder(nums,A,n,0);
            
        Pair[] pairs = new Pair[nums.size()];
       
        
        for(int i=0;i<n;i++){
            pairs[i] = new Pair(nums.get(i),i);
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
    
    public static void inorder(List<Integer> nums,int[] A,int n,int index){
        if(index>=n)
            return;
            
        inorder(nums,A,n,2*index+1);
        nums.add(A[index]);
        inorder(nums,A,n,2*index+2);
        
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