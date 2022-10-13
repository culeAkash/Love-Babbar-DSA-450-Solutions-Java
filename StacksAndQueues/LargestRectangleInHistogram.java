class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long heights[], long n) 
    {
        if(heights.length==0)
            return 0;
        
        Stack<Integer> stack = new Stack<>();
        
        long[] leftSmaller = new long[heights.length];
        long[] rightSmaller = new long[heights.length];
        
        //finding leftSmaller
        
        for(int i=0;i<heights.length;i++){
            
            while(!stack.empty()){
                if(heights[stack.peek()]<heights[i]){
                    leftSmaller[i] = stack.peek() + 1;
                    break;
                }
                stack.pop();
            }
            
            if(stack.empty())
                leftSmaller[i] = 0;
            
            stack.push(i);
        }
        
        //empty the stack before calculating right Smallers
        while(!stack.empty())
            stack.pop();
        
        //finding rightSmaller
        
        for(int i=heights.length-1;i>=0;i--){
            
            while(!stack.empty()){
                if(heights[stack.peek()]<heights[i]){
                    rightSmaller[i] = stack.peek() - 1;
                    break;
                }
                stack.pop();
            }
            
            if(stack.empty())
                rightSmaller[i] = heights.length - 1;
            
            stack.push(i);
        }
        
        //get maximum area using formula
        long max = Integer.MIN_VALUE;
        
        for(int i=0;i<heights.length;i++){
            max = Math.max(max,(rightSmaller[i]-leftSmaller[i]+1)*heights[i]);
        }
        
        return max;
    }
        
}