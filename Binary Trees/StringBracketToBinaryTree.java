import java.util.*;
public class Solution
{
    public static BinaryTreeNode<Integer> treeFromBracket(String str)
    {
        if(str.length()==0)
            return null;
        
        if(str.length()==1)
            return new BinaryTreeNode(str.charAt(0)-'0');
        
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(str.charAt(0)-'0');
        
        String small = "";
        Stack<Character> st = new Stack<>();
        int i = 1;
        st.add(str.charAt(i));
        i++;
        while(!st.empty() && i<str.length()){
            if(str.charAt(i)==')'){
                if(st.peek()=='(')
                    st.pop();
                else
                    st.push(')');
            }
            else if(str.charAt(i)=='(')
                st.push('(');
            if(!st.empty())
            small+= str.charAt(i);
            i++;
        }
        node.left = treeFromBracket(small);
        small = "";
        if(i<str.length())
        st.add(str.charAt(i));
        i++;
        while(!st.empty() && i<str.length()){
            if(str.charAt(i)==')'){
                if(st.peek()=='(')
                    st.pop();
                else
                    st.push(')');
            }
            else if(str.charAt(i)=='(')
                st.push('(');
            if(!st.empty())
            small+= str.charAt(i);
            i++;
        }
        node.right = treeFromBracket(small);
        return node;
        
    }
}