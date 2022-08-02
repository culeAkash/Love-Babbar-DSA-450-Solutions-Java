
class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        int i =0,j=0;
        int sum = 0;
        int count = Integer.MAX_VALUE;
        while(j<n){
            sum += a[j++];
            
            while(sum>x){
                count = Math.min(count,(j-i));
                sum -= a[i];
                i++;
            }
        }
        
        return count;
    }
}