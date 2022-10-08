class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)>='0' && S.charAt(i)<='9')
                stack.push(S.charAt(i)-'0');
            else{
                int second = stack.pop();
                int first = stack.pop();
                int res  = 0;
                switch(S.charAt(i)){
                    case '+':{
                        res = first + second;
                        break;
                    }
                    case '*':{
                        res = first*second;
                        break;
                    }
                    case '/':{
                        res = first / second;
                        break;
                    }
                    case '-':{
                        res = first - second;
                        break;
                    }
                }
                // System.out.println(res +" "+stack.size());
                stack.push(res);
            }    
        }
        return stack.pop();
        
    }
}