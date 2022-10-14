class Solution
{
    public String FirstNonRepeating(String A)
    {
        int[] visited = new int[26];
        Queue<Character> q = new LinkedList<>();
        String res = "";
        int index = 0;
        int i = 0;
        for(;i<A.length();i++){
            char ch = A.charAt(i);
            q.offer(ch);
            visited[ch - 'a']++;
            
            while(!q.isEmpty()){
                if(visited[q.peek() - 'a']>1)
                    q.poll();
                else
                {
                    res += q.peek();
                    break;
                }
            }
                
            if(q.isEmpty())
                res += "#";
                
            }
        
        return res;
    }
}