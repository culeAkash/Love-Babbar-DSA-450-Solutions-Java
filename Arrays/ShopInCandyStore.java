class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        ArrayList<Integer> ans = new ArrayList<>();
        
        Arrays.sort(candies);
        
        int cost = 0;
        int buyIndex = 0, freeIndex = N-1;
        
        while(buyIndex<=freeIndex){
            cost += candies[buyIndex++];
            freeIndex = freeIndex - K;
        }
        
        ans.add(cost);
        cost = 0;
         buyIndex = N-1; freeIndex = 0;
        
        while(buyIndex>=freeIndex){
            cost += candies[buyIndex--];
            freeIndex = freeIndex + K;
        }
        ans.add(cost);
        return ans;
        
    }
}