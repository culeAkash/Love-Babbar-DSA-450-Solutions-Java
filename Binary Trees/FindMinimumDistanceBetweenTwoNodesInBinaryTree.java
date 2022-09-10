class GfG {
    int findDist(Node root, int a, int b) {
        int disA = findDistance(root,a);
        int disB = findDistance(root,b);
        
        
        Node lca = findLca(root,a,b);
        
        
        int disLca = findDistance(root,lca.data);
        // System.out.println(disLca);
        
        return disA + disB - (2*disLca);
    }
    
    Node findLca(Node root,int a, int b){
        if(root==null)
            return null;
            
        if(root.data==a || root.data==b)
            return root;
            
        Node left = findLca(root.left,a,b);
        Node right = findLca(root.right,a,b);
        
        if(left!=null && right!=null)
            return root;
        
        if(left!=null)
            return left;
            
        return right;
        
        
    }
    
    int findDistance(Node root,int a){
        if(root==null)
            return 100001;
            
        if(root.data==a)
            return 0;
            
        return  Math.min(findDistance(root.left,a),findDistance(root.right,a))+1;
    }
}