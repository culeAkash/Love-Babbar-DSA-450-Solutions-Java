class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        Map<Integer,Stack<Integer>> map = new HashMap<>();
        
        for(int i=0;i<2*e;i+=2){
            if(map.get(A[i])==null)
                map.put(A[i],new Stack<Integer>());
                
            map.get(A[i]).push(A[i+1]);
        }
        
        for(int i=0;i<2*e;i+=2){
            if(map.get(B[i])==null)
                return 0;
            
            if(map.get(B[i]).peek()!=B[i+1])
                return 0;
                
            map.get(B[i]).pop();
        }
        return 1;
    }
};