if(node1==null || node2==null)
        return node1==node2;
        
        return node1.data==node2.data && areAnagrams(node1.left,node2.right) 
        && areAnagrams(node1.right,node2.left)