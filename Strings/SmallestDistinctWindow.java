class Solution {
    public int findSubString( String str) {
        Set<Character> hash = new HashSet<>();
        
        for(int i=0;i<str.length();i++){
            hash.add(str.charAt(i));
        }
        
        int size = hash.size();
        
        Map<Character,Integer> map = new HashMap<>();
        int i=0,j=0,ans = Integer.MAX_VALUE;
        
        while(i<=j && j<str.length()){
            map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)+1);
            
            if(map.size()==size){
                //shrink window
                while(map.size()==size){
                    ans = Math.min(ans,j-i+1);
                    
                    int c = map.get(str.charAt(i));
                    c= c-1;
                    
                    if(c==0)
                        map.remove(str.charAt(i));
                    else
                        map.put(str.charAt(i),c);
                        
                    i++;
                }
            }
            j++;
        }
        return ans;
    }
}