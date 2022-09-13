class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node==null)
            return -1;
        int min = node .data;
        while(node.left!=null){
            node = node.left;
            min = node.data;
        }
        return min;
    }
}