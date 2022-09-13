class Solution {
    public TreeNode balanceBST(TreeNode root) {
        if(root==null)
            return null;
        
        List<TreeNode> nodes = new ArrayList<>();
        inorder(root,nodes);
        
        return createBST(nodes,0,nodes.size()-1);
    }
    
    TreeNode createBST(List<TreeNode> nodes,int sI,int eI){
        if(sI>eI)
            return null;
        
        int mI = sI + (eI-sI)/2;
        
        TreeNode root = nodes.get(mI);
        root.left = createBST(nodes,sI,mI-1);
        root.right = createBST(nodes,mI+1,eI);
        return root;
    }
    
    void inorder(TreeNode root,List<TreeNode> nodes){
        if(root==null)
            return;
        
        inorder(root.left,nodes);
        nodes.add(root);
        inorder(root.right,nodes);
    }
}