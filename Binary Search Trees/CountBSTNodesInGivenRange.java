class Tree
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int k1, int k2)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        
       
        
        if(root.data<k1)
        {
            count+= getCount(root.right,k1,k2);
        }
        else if(root.data>k2)
        {
            count+= getCount(root.left,k1,k2);
        }
        
         if(root.data>=k1 && root.data<=k2){
            count++;
            count+=getCount(root.right,k1,k2);
            count+=getCount(root.left,k1,k2);
        }
        return count;
    }
}