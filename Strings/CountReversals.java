//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        if((s.length() & 1) == 1)
            return -1;
            
        Stack<Character> stack = new Stack<>();
        int countOp=0,countCl=0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='{'){
                stack.push('{');
                countOp++;
            }
            else if(ch=='}' && !stack.empty() && stack.peek()=='{'){
                stack.pop();
                countOp--;
            }
            else 
                countCl++;
        }
        
        if((countOp & 1) == 0) countOp = countOp/2;
        else countOp = (countOp/2) + 1;
        
        if((countCl & 1) == 0) countCl = countCl/2;
        else countCl = (countCl/2) + 1;
        
        return countOp + countCl;
    }
}