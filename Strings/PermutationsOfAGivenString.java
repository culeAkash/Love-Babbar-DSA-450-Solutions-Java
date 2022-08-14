class Solution {
    public List<String> find_permutation(String S) {
        Set<String> res = new HashSet<>();
        boolean[] taken = new boolean[S.length()];
        int n = S.length();
        helper(S,res,taken,n,"");
        List<String> ans = new ArrayList<>();
        for(String s:res)
            ans.add(s);
            
        Collections.sort(ans);
            return ans;
    }
    
    public void helper(String s,Set<String> res,boolean[] taken,int n,String str){
        if(str.length()==n){
            res.add(str);
            return;
        }
        
        if(str.length()>n)
            return;
            
        for(int i=0;i<n;i++){
            if(!taken[i]){
                taken[i] = true;
                helper(s,res,taken,n,str+s.charAt(i));
                taken[i] = false;
            }
        }
    }
}