class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        
        int count = 0;
        for(int num:arr){
            int req = k - num;
            if(map.containsKey(req)){
                count+= map.get(req);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        return count;
    }
}
