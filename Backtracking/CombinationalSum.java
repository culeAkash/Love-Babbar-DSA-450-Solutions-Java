class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        Collections.sort(A);
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<A.size();i++){
            if(i==0 || A.get(i)!=A.get(i-1))
                arr.add(A.get(i));
        }
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        helper(arr,B,res,ans,0);
        return res;
    }
    
    static void helper(ArrayList<Integer> arr,int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> ans,int index){
        if(target==0){
            res.add(new ArrayList<Integer>(ans));
            return;
        }
        
        if(index>=arr.size())
            return;
            
        if(arr.get(index)>target)
            return;
            
        
        
        ans.add(arr.get(index));
        helper(arr,target-arr.get(index),res,ans,index);
        ans.remove(ans.size()-1);
        
        helper(arr,target,res,ans,index+1);
    }
}