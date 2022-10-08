class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] ans = new long[n];
        Stack<Long> st = new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            
            while(!st.empty() && st.peek()<=arr[i]){
                st.pop();
            }
            
            if(st.empty())
                ans[i] = -1;
            else
                ans[i] = st.peek();
                
            st.push(arr[i]);
        }
        return ans;
    } 
}