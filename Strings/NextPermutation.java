class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        List<Integer> res = new ArrayList<>();
        if(arr.length==0){
            return res;
        }        
        int left=arr.length-2;
        int right=arr.length-1;
        
        //for finding point of change 
        while(left>=0 && arr[left]>=arr[left+1]){
            left--;
        }
        
        //now finding the nearest greater value to arr[left] now to replace 
        if(left>=0){
            while(right>=0 && arr[right]<=arr[left]){
                right--;
            }
            //swap
            swap(arr,left,right);
        }
        //now for the least order in dictionary we reverse from index left onwards
        reverse(arr,left+1,arr.length-1);
        
        for(int i:arr)
            res.add(i);
        return res;
    }
    
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
            start++;
            end--;
        }
    }
}