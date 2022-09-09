class Solution
{
    int leafLevel = -1;
    boolean check(Node root)
    {
	    if(root.left==null && root.right==null)
	        return true;

        leafLevel = -1;
        return helper(root,0);
        
    }
    
    boolean helper(Node root,int level){
        if(root==null)
            return true;
        if(root.left==null && root.right==null){
            if(leafLevel == -1){
                leafLevel = level;
                return true;
            }
            return level == leafLevel;
        }
        return helper(root.left,level+1) && helper(root.right,level+1);
        
        
    }
}