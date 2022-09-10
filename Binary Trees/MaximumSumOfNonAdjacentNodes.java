class Solution
{
    //Function to return the maximum sum of non-adjacent nodes.
    static int getMaxSum(Node root)
    {
        Map<Node,Integer> map = new HashMap<>();
        
        helper(root,map);
        return map.get(root);
    }
    
    static void helper(Node root,Map<Node,Integer> map){
        if(root==null){
            map.put(root,0);
            return;
        }
        
        helper(root.left,map);
        helper(root.right,map);
        
        int ls = map.get(root.left);
        int rs = map.get(root.right);
        
        int val = root.data;
        
        if(root.left!=null)
            val += map.get(root.left.left) + map.get(root.left.right);
            
        if(root.right!=null)
            val += map.get(root.right.left) + map.get(root.right.right);
            
        map.put(root,Math.max(val,ls+rs));
            
        
    }
}