class Solution
{
    public int[][] overlappedInterval(int[][] arr)
    {
        Arrays.sort(arr,new Comp());
        
        List<int[]> res = new ArrayList<>();
        
        int start = arr[0][0];
        int end = arr[0][1];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=end){
                end = Math.max(end,arr[i][1]);
            }
            else{
                int[] ans = new int[2];
                ans[0] = start;
                ans[1] = end;
                res.add(ans);
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][2]);
    }
}

public class Comp implements Comparator<int[]>{
    public int compare(int[]a,int[]b){
        return a[0] - b[0];
    }
}