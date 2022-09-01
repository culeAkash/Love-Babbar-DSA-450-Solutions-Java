class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        Pair pair= diameterHelper(root);
        return pair.diameter+1;
    }
    
    public static Pair diameterHelper(Node root)
    {
        if(root==null)
        {
            Pair ans= new Pair();
            ans.height=0;
            ans.diameter=0;
            return ans;
        }
        Pair leftHelp= diameterHelper(root.left);
        Pair rightHelp= diameterHelper(root.right);
        int distance= rightHelp.height+leftHelp.height ;
        int diam= Math.max(leftHelp.diameter,rightHelp.diameter);
        Pair ans= new Pair();
        ans.height= 1+Math.max(rightHelp.height,leftHelp.height);
        ans.diameter= Math.max(diam,distance);
        return ans;
    }
}