public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        if(head==null)
            return res;
            
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        
        stack1.push(head);
        while(!stack1.empty()){
                stack2.push(stack1.pop());
               if(stack2.peek().left!=null)
                    stack1.push(stack2.peek().left);
                if(stack2.peek().right!=null)
                    stack1.push(stack2.peek().right);
                
        }
        while(!stack2.empty())
            res.add(stack2.pop().val);
            
        return res;    
    }