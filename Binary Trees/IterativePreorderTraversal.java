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
    public ArrayList<Integer> preorderTraversal(TreeNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        if(head==null)
            return res;
            
        Stack<TreeNode> stack = new Stack<>();
        
        while(head!=null || !stack.empty()){
            while(head!=null){
                res.add(head.val);
                stack.push(head);
                head = head.left;
            }
            head = stack.pop();
            head = head.right;
        }
        return res;
    }
}