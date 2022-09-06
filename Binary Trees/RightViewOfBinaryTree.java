import java.util.*;
public class Solution {
    static int level = 0;
    public static ArrayList<Integer> printRightView(BinaryTreeNode<Integer> root) {
       ArrayList<Integer> res = new ArrayList<>();
        level =0;
        helper(res,root,0);
        return res;
    }
    
    public static void helper(ArrayList<Integer> res,BinaryTreeNode<Integer> root,int maxLevel){
        if(root==null)
            return;
        
        if(maxLevel==level){
            res.add(root.data);
            level++;
        }
        
        helper(res,root.right,maxLevel+1);
        helper(res,root.left,maxLevel+1);
    }
}