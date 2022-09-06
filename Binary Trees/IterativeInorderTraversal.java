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
    public ArrayList<Integer> inorderTraversal(TreeNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        if(head==null)
            return res;
            
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode present = head;
        
        while(present!=null || !stack.empty()){
            while(present!=null){
                stack.push(present);
                present = present.left;
            }
            
            res.add(stack.peek().val);
            present = stack.pop().right;
        }
        
        return res;
    }
}
