class Solution {
    static int countSquares(int N) {
        int count = 0,i =1;
        
        while(i*i<N){
            count++;
            i++;
        }
        return count;
    }
}