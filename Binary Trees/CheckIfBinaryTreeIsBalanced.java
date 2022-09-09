public class Solution {

	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		if(root==null)
            return true;
        
        return helper(root).isBalanced;
	}
    
    static IsBalancedReturn helper(BinaryTreeNode<Integer> root){
        if(root==null){
            return new IsBalancedReturn(true,0);
        }
        
        IsBalancedReturn leftAns = helper(root.left);
        IsBalancedReturn rightAns = helper(root.right);
        
        int height = 1 + Math.max(leftAns.height,rightAns.height);
        
        boolean isBalanced = true;
        
        if(Math.abs(leftAns.height-rightAns.height)>1)
            isBalanced = false;
        else
            isBalanced = leftAns.isBalanced && rightAns.isBalanced;
        return new IsBalancedReturn(isBalanced,height);
        
    }
}

class IsBalancedReturn{
    boolean isBalanced;
    int height;
    
    public IsBalancedReturn(boolean is,int h){
        isBalanced = is;
        height = h;
    }
}