class Solution {
    public static int checkRedundancy(String s) {
        Stack<Character> stack = new Stack<>();
        
        //For redundancy there are two conditions:
        // 1. There are no operators between opening and closinf brackets
        // 2. Immediate top element in stack for ')' is '('
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch==')'){
                char top = stack.pop();
                
                boolean flag = true;
                while(top!='('){
                    if(top=='+' || top=='-' || top=='*' || top=='/')
                        flag = false;
                        
                    top = stack.pop();
                }
                
                if(flag==true)
                    return 1;
            }
            else
                stack.push(ch);
        }
        
        return 0;
    }
}