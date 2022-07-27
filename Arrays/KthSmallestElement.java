class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=l;i<=r;i++){
            pq.add(arr[i]);
            if(pq.size()>k)
                pq.poll();
        }
        return pq.poll();
    } 
}