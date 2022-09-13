class Solution
{
    static int count = 0;
	public static int countPairs(Node root1, Node root2, int x)
	{
	    Set<Integer> set = new HashSet<>();
	    count = 0;
	    
	    inorder(root1,set);
	    
	    countMatches(root2,x,set);
	    return count;
	}
	
	static void countMatches(Node root,int target,Set<Integer> set){
	    if(root==null)
	        return;
	        
	    if(set.contains(target-root.data))
	        count++;
	        
	    countMatches(root.left,target,set);
	    countMatches(root.right,target,set);
	}
	
	static void inorder(Node root,Set<Integer> set){
	    if(root==null)
	        return;
	        
	    inorder(root.left,set);
	    set.add(root.data);
	    inorder(root.right,set);
	}
}