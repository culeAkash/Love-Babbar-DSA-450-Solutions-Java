static int index =0;
//Function that constructs BST from its preorder traversal.
public static Node post_order(int pre[], int size) 
{
    int bound = Integer.MAX_VALUE;
    index = 0;
    return helper(pre,size,bound);
} 

static Node helper(int[] pre,int size,int bound){
    if(index>=size || pre[index]>=bound)
        return null;
        
    Node root = new Node(pre[index++]);
    
    root.left = helper(pre,size,root.data);
    root.right = helper(pre,size,bound);
    return root;
    
}