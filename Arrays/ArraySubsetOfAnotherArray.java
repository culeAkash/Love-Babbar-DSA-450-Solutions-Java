class Compute {
    public String isSubset( long a1[], long a2[], long i, long m) {
        Map<Long,Integer> map = new HashMap<>();
        
        for(Long n : a1){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        for(Long n : a2){
            if(!map.containsKey(n))
                return "No";
            else{
                int count = map.get(n);
                count = count - 1;
                if(count==0)
                    map.remove(n);
                else
                    map.put(n,count);
            }
        }
        
        return "Yes";
        
    }
}