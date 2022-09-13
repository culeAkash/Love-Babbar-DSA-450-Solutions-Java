import java.util.*;
public class Solution {

   static TreeNode < Integer > mergeBST(TreeNode < Integer > root1, TreeNode < Integer > root2) {

      if(root1==null)
          return root2;
      
      if(root2==null)
          return root1;
       
       List<TreeNode<Integer>> nodes = new ArrayList<>();
       
       inorder(root1,nodes);
       inorder(root2,nodes);
       
       Collections.sort(nodes,(n1,n2) -> n1.data - n2.data);
       
       return createBST(nodes,0,nodes.size()-1);

   }
    
    static void inorder(TreeNode<Integer> root,List<TreeNode<Integer>> nodes){
        if(root==null)
            return;
        
        inorder(root.left,nodes);
        nodes.add(root);
        inorder(root.right,nodes);
    }
    
    static TreeNode<Integer> createBST(List<TreeNode<Integer>> nodes,int sI,int eI){
        if(sI>eI)
            return null;
        
        int mI = sI + (eI-sI)/2;
        
        TreeNode<Integer> root = nodes.get(mI);
        root.left = createBST(nodes,sI,mI-1);
        root.right = createBST(nodes,mI+1,eI);
        return root;
    }

}