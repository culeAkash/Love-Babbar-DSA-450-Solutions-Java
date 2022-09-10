import java.util.*;

public class Solution {
    static ArrayList < ArrayList < Integer >> res;
    public static ArrayList < ArrayList < Integer >> kPathSum(BinaryTreeNode < Integer > root, int k) {
        res = new ArrayList < ArrayList < Integer >>();
        ArrayList < Integer > paths = new ArrayList < Integer >();
        
        getAllPaths(root,k,paths);
        return res;
    }
    
    static void getAllPaths(BinaryTreeNode < Integer > root, int k,ArrayList < Integer > paths){
        if(root == null)
            return;
        paths.add(root.data);
        
        getAllPaths(root.left,k,paths);
        getAllPaths(root.right,k,paths);
        
        int sum = 0;
        for(int i=paths.size()-1;i>=0;i--){
            sum += paths.get(i);
            
            if(sum==k)
                addPath(paths,i);
        }
        paths.remove(paths.size()-1);
    }
    
    static void addPath(ArrayList<Integer> paths,int index){
        ArrayList<Integer> path = new ArrayList<>();
        for(int i=index;i<paths.size();i++){
            path.add(paths.get(i));
        }
        res.add(path);
    }
}