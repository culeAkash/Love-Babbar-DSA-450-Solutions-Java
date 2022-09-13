public class Solution {
	public static BinaryTreeNode<Integer> deleteNode(BinaryTreeNode<Integer> root, int key) {
		if(root==null)
            return null;
        
        //agar root hi key h to 3 cases arise ho sakte h
        //1. ki root ka koi child ni h to null return kar dengr kyu hmlog ko voh root hi hatana h4
        //2. Agar root ka koi ek child h to bas voh child return karna h
        //3. Agar root ka dono child present h to right side se sabse chhota value ko root se replace karke right side se uss node ko delete kardo
        
        if(root.data==key){
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
            
            BinaryTreeNode<Integer> temp = root.right;
            int min = temp.data;
            while(temp.left!=null){
                temp = temp.left;
                min = temp.data;
            }
            
            root.data = min;
            root.right = deleteNode(root.right,min);
            return root;
        }
        else if(root.data<key){
            //right side se delete karna h
            BinaryTreeNode<Integer> rightAns = deleteNode(root.right,key);
            root.right = rightAns;
            return root;
        }
        else{
            //left side se delete karna h
            BinaryTreeNode<Integer> leftAns = deleteNode(root.left,key);
            root.left = leftAns;
            return root;
        }
        
	}
}