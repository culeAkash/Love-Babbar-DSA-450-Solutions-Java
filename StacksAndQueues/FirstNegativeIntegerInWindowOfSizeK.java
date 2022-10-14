class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Integer> q = new LinkedList<>();
        long[] res = new long[N-K+1];
        int index = 0;
        
        for(int i=0;i<K;i++)
            q.offer(i);
            
        while(!q.isEmpty() && A[q.peek()]>0)
                q.poll();
                
            if(q.isEmpty())
                res[index++] = 0;
            else
                res[index++] = A[q.peek()];
            
        for(int i=K;i<N;i++){
            q.offer(i);
            while(!q.isEmpty() && (i-K)>=q.peek())
                q.poll();
                
            while(!q.isEmpty() && A[q.peek()]>0)
                q.poll();
                
            if(q.isEmpty())
                res[index++] = 0;
            else
                res[index++] = A[q.peek()];
        }
        return res;
    }
}