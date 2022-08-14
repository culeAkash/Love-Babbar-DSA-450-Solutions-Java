class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String str)
    {
        if(str.length()==0)
		{
			return true;
		}
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='(')
			{
				stack.push(str.charAt(i));
			}
			else if(str.charAt(i)==']' || str.charAt(i)=='}' || str.charAt(i)==')')
			{
				if(stack.isEmpty())
					return false;
			
				char ch= stack.pop();
				if(str.charAt(i)==']'&& ch=='[')
					continue;
				else if(str.charAt(i)=='}' && ch=='{')
					continue;
				else if(str.charAt(i)==')' && ch=='(')
					continue;
				else
					return false;
			}
		}
		return stack.isEmpty();
    }
}