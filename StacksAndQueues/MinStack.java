/*Complete the function(s) below*/
class GfG{
    int minEle = 0;
	public void push(int val,Stack<Integer> s)
	{
	   if(s.size() == 0){
	        s.push(val);
	        minEle = val;
	        return;
	    }
	   if(val >= minEle){
	       s.push(val);
	   }
	   else // val < minEle 
	   {
	       s.push(2 *val - minEle);
	       minEle = val;
	   }
	}
	public int pop(Stack<Integer> s)
        {
            if(s.size() == 0) 
	        return -1;
        
	     if(s.peek() < minEle){
	            int ret = minEle;
	             minEle = 2*minEle - s.peek();
	             s.pop();
                return ret;
	         }
        
	     return s.pop(); // if s.peek() >= minEle
	}
	public int min(Stack<Integer> s)
        {
           if(s.size() == 0) return -1;

	   return minEle;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           return s.size()==n;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           return s.size()==0;
	}
}