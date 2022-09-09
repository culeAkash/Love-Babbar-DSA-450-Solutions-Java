/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> solve(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null)
            return res;
            
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode top = q.poll();
            while(top!=null){
                res.add(top.val);
                if(top.left!=null)
                    q.add(top.left);
                top = top.right;
            }
        } 
        return res;
    }
}