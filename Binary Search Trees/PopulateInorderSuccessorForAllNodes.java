class Solution{
    Node prev = null;
    public void populateNext(Node root){
         prev = null;
        
        helper(root);
    }
    
    void helper(Node root){
        if(root==null)
            return;
            
        helper(root.left);
        if(prev!=null){
            prev.next = root;
        }
        prev = root;
        helper(root.right);
    }
}