class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    int i = 0;
    Node binaryTreeToBST(Node root)
    {
       List<Integer> list = new ArrayList<>();
       
       inorder(root,list);
       
       Collections.sort(list);
       i = list.size() - 1;
       return makeBST(root,list);
       
       
    }
    
    void inorder(Node root,List<Integer> list){
        if(root==null)
            return;
            
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    
    Node makeBST(Node root,List<Integer> list){
        if(root==null || i<0)
            return null;
            
        Node r = makeBST(root.right,list);
        Node node = new Node(list.get(i));
        i--;
        node.right = r;
        node.left = makeBST(root.left,list);
        return node;
    }
}