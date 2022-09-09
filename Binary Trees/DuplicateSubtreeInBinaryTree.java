class Solution {
    Map<String,Integer> map = new HashMap<>();
    int dupSub(Node root) {
        helper(root);
        
        for(String s: map.keySet()){
            // System.out.println(s);
            if(map.get(s)>=2)
                return 1;
        }
        return 0;
    }
    
    String helper(Node root){
        if(root==null)
            return "$";
        
        String s = "";    
        if(root.left==null && root.right==null)
        {
            s = "*" + s + root.data;
            // System.out.println(s);
            return s;
        }
        
        s = "*" + s + (root.data);
        // System.out.println(s);
        s = s + helper(root.left);
        // System.out.println(s);
        s = s + helper(root.right);
        // System.out.println(s);
        map.put(s,map.getOrDefault(s,0)+1);
        return s;
    }
    
}