import java.util.*;

public class Solution {
	public static ArrayList<Integer> traverseBoundary(TreeNode root){
		ArrayList<Integer> res = new ArrayList<>();
        if(isLeaf(root)){
            res.add(root.data);
            return res;
        }
        res.add(root.data);
        leftBound(res,root);
        addLeaves(res,root);
        rightBound(res,root);
        return res;
        
	}
    
    static void addLeaves(ArrayList<Integer> res,TreeNode root){
        if(root==null)
            return;
        if(isLeaf(root))
            res.add(root.data);
        
        addLeaves(res,root.left);
        addLeaves(res,root.right);
    }
    
    static void leftBound(ArrayList<Integer> res,TreeNode root){
        root = root.left;
        while(root!=null){
            if(!isLeaf(root))res.add(root.data);
            
            if(root.left!=null)root = root.left;
            else root = root.right;
        }
    }
    
    static void rightBound(ArrayList<Integer> res,TreeNode root){
        root = root.right;
        Stack<Integer> sm = new Stack<>();
        while(root!=null){
            if(!isLeaf(root))sm.push(root.data);
            
            if(root.right!=null)root = root.right;
            else root = root.left;
        }
        while(!sm.empty())
            res.add(sm.pop());
    }
    
    static boolean isLeaf(TreeNode node){
        return node.left==null && node.right==null;
    }
}