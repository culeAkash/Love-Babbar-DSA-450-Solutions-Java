import java.util.*;
public class Solution {
    public static int largestSubtreeSum(TreeNode<Integer> root) {
        Map<Integer,Integer> map = new HashMap<>();
        
        helper(root,map);
        
        int max = Integer.MIN_VALUE;
        
        for(int key: map.keySet()){
            max = Math.max(max,key);
        }
        
        return max;
    }
    
    static int helper(TreeNode<Integer> root,Map<Integer,Integer> map){
        if(root==null)
            return 0;
        
        if(root.left==null && root.right==null){
            map.put(root.data,map.getOrDefault(root.data,0)+1);
            return root.data;
        }
        
        int sum =  root.data;
        
        sum += helper(root.left,map);
        sum += helper(root.right,map);
        
        map.put(sum,map.getOrDefault(sum,0)+1);
        return sum;
    }
}