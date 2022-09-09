public class Solution {
	public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		 LinkedListReturn ans= helper(root);
        return ans.head;
	}
    
    static LinkedListReturn helper(BinaryTreeNode<Integer> root){
        if(root==null)
        {
            LinkedListReturn ans= new LinkedListReturn();
            ans.head=null;
            ans.tail=null;
            return ans;
        }
        LinkedListReturn leftAns= helper(root.left);
        BinaryTreeNode<Integer> head= leftAns.head;
        BinaryTreeNode<Integer> tail= leftAns.tail;
        
        if(head==null)
        {
            head=root;
            tail=root;
        }
        else{
            tail.right=root;
            root.left=tail;
            tail=tail.right;
        }
        
        LinkedListReturn rightAns= helper(root.right);
        if(rightAns.head!=null)
        {
            rightAns.head.left=tail;
            tail.right=rightAns.head;
            tail=rightAns.tail;
        }
        
        LinkedListReturn ans= new LinkedListReturn();
        ans.head=head;
        ans.tail=tail;
        return ans;
    }
	

}

class LinkedListReturn{
        BinaryTreeNode<Integer> head;
        BinaryTreeNode<Integer> tail;
    }