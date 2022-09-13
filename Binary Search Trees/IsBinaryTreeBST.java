public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    Node prev = null;
    boolean isBST(Node root)
    {
        if(root==null)
            return true;
            
        boolean leftAns = isBST(root.left);
        if(prev==null)
            prev = root;
        else{
            if(prev.data>=root.data)
                return false;
            prev = root;
        }
        boolean rightAns = isBST(root.right);
        return leftAns && rightAns;
    }
}