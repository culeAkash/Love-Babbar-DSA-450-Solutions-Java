class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int size = arr.length;
        
        for(int i=0;i<size-3;i++){
            int sum1 = k - arr[i];
            for(int j = i+1;j<size-2;j++){
                int sum2 = sum1 - arr[j];
                
                int start = j+1;
                int end = size-1;
                
                while(start<end){
                    
                    int sum3 = arr[start] + arr[end];
                    
                    if(sum3<sum2)
                        start++;
                    else if(sum3>sum2)
                        end--;
                    else if(sum3==sum2){
                        ArrayList<Integer> ans = new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[start]);
                        ans.add(arr[end]);
                        res.add(ans);
                        
                        while(start<end && arr[start]==arr[start+1])start++;
                    while(start<end && arr[end]==arr[end-1])end--;
                    
                    start++;
                    end--;
                    
                    }
                    
                    
                }
                while(j<size-2 && arr[j]==arr[j+1])j++;
            }
            while(i<size-3 && arr[i]==arr[i+1])i++;
        }
        return res;
    }
}