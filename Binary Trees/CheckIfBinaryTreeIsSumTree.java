/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
	boolean isSumTree(Node root)
	{
        if(root==null)
            return true;
            
        return helperSumTree(root).isSumTree;
	}
	
	SumTreeReturn helperSumTree(Node root){
	    
	    if(root==null)
	        return new SumTreeReturn(true,0);
	    
	    if(root.left==null && root.right==null){
	        return new SumTreeReturn(true,root.data);
	    }
	    
	    SumTreeReturn leftAns = helperSumTree(root.left);
	    SumTreeReturn rightAns = helperSumTree(root.right);
	    
	    boolean isSumTree = true;
	    
	    int sum = leftAns.sum + rightAns.sum + root.data;
	    
	    if(leftAns.sum + rightAns.sum != root.data)
	        isSumTree = false;
	    else
	        isSumTree = leftAns.isSumTree && rightAns.isSumTree;
	        
	   return new SumTreeReturn(isSumTree,sum);
	    
	}
}

class SumTreeReturn{
    boolean isSumTree;
    int sum;
    
    public SumTreeReturn(boolean i,int s){
        isSumTree = i;
        sum = s;
    }
}