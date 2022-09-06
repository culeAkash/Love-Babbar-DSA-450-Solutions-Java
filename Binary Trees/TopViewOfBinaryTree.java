import java.util.*;
public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
	    ArrayList<Integer> res = new ArrayList<>();
        
        if(root == null)
            return res;
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                Pair top = q.poll();
                
                if(!map.containsKey(top.level))
                    map.put(top.level,top.node.val);
                
                if(top.node.left!=null)
                    q.add(new Pair(top.node.left,top.level-1));
                
                if(top.node.right!=null)
                    q.add(new Pair(top.node.right,top.level+1));
            }
        }
        
        for(Integer val : map.values()){
            res.add(val);
        }
        return res;
        
	}
}

class Pair{
    BinaryTreeNode node;
    int level;
    
    public Pair(BinaryTreeNode n,int l){
        node = n;
        level = l;
    }
}