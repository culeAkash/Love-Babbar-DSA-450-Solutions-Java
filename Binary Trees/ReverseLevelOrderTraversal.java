class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(node==null)
            return res;
        
        
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        q.add(node);
        
        while(!q.isEmpty()){
            Node top = q.poll();
            stack.push(top.data);
            
            if(top.right!=null)
                q.add(top.right);
            
            if(top.left!=null)
                q.add(top.left);
        }
        
        while(!stack.empty())
            res.add(stack.pop());
            
        return res;
    }
}      