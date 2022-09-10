class Solution{
    int sum = 0;
    int length = 0;
    public int sumOfLongRootToLeafPath(Node root)
    {
        sum = 0;
        length = 0;
        
        helper(root,0,0);
        return sum;
    }
    
    void helper(Node root,int s,int l){
        if(root==null)
            return;
            
        if(root.left==null && root.right==null){
            s += root.data;
            l++;
            if(l>length){
                sum = s;
                length = l;
            }
            else if(l==length)
                sum = Math.max(sum,s);
            return;
        }
        
        s += root.data;
        helper(root.left,s,l+1);
        helper(root.right,s,l+1);
    }
}