
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int n:A){
            max = Math.max(max,n);
            min =  Math.min(min,n);
        }
        
        return max+min;
    }
}