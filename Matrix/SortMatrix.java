class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                pq.offer(Mat[i][j]);
            }
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Mat[i][j] = pq.poll();
            }
        }
        
        return Mat;
    }
};