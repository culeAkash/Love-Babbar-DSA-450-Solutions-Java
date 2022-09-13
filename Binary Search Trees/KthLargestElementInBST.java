import java.util.ArrayList;

public class Solution {
	public static int KthLargestNumber(TreeNode<Integer> root, int K) {
		if(root==null)
            return -1;
        
        int k[] = new int[1];
        k[0] = K;
        
        TreeNode<Integer> node = helper(root,k);
        return node==null?-1:node.data;
	}
    
    static TreeNode<Integer> helper(TreeNode<Integer> root,int[] k){
        if(root==null)
            return null;
        
        TreeNode<Integer> rightAns = helper(root.right,k);
        if(rightAns!=null)
            return rightAns;
        k[0]--;
        if(k[0]==0)
            return root;
        return helper(root.left,k);
    }
}