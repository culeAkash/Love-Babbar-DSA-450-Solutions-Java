class Solution{
    public void toSumTree(Node root){
         if(root==null)
            return;
            
        helper(root);
    }
    
    public int helper(Node root){
        if(root==null)
            return 0;
        int temp = root.data;
        root.data = helper(root.left) + helper(root.right);
        return root.data + temp;
    }
}