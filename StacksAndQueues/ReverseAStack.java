class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        if(s.size()==0)
            return;
            
        int temp = s.pop();
        reverse(s);
        Stack<Integer> stack = new Stack<>();
        while(!s.empty())
            stack.push(s.pop());
            
        s.push(temp);
        while(!stack.empty())
            s.push(stack.pop());
            
        
        
    }
}