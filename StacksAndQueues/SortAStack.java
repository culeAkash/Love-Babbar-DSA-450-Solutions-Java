class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
	    
		if(s.size()<=1)
		    return s;
		    
		int x = s.pop();
		s = sort(s);
		addToRightPlace(s,x);
		return s;
	}
	
	void addToRightPlace(Stack<Integer> stack,int x){
	    if(stack.empty() || stack.peek()<=x){
	        stack.push(x);
	        return;
	    }
	    
	    int y = stack.pop();
	    addToRightPlace(stack,x);
	    stack.push(y);
	}
}