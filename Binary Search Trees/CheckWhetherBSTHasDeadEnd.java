class GFG
{
    public static boolean isDeadEnd(Node root)
    {
        int lower_bound = 0;
        int upper_bound = Integer.MAX_VALUE;
        
        return helper(root,lower_bound,upper_bound);
    }
    
    static boolean helper(Node root,int lb,int ub){
        if(root==null)
            return false;
            
        if(root.data==lb+1 && root.data==ub-1)
            return true;
            
        return helper(root.left,lb,root.data) || helper(root.right,root.data,ub);
    }
}