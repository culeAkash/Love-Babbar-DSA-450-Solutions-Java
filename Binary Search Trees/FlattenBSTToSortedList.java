public class Solution
{
    static TreeNode<Integer> prev;
    public static TreeNode<Integer> flatten(TreeNode<Integer> root)
    {
        prev = null;
        
        helper(root);
        return prev;
    }
    static void helper(TreeNode<Integer> root){
        if(root==null)
            return;
        
        helper(root.right);
        
        root.right = prev;
        prev = root;
        helper(root.left);
        root.left=null;
    }
    