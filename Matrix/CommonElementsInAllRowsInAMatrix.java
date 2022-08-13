import java.util.*;
public class Solution
{
    public static ArrayList<Integer> findCommonElements(ArrayList<ArrayList<Integer>> matrix)
    {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int n = matrix.size();
        int m = matrix.get(0).size();
        
        if(n==1)
            return matrix.get(0);
        
        for(int j = 0;j<m;j++){
            map.put(matrix.get(0).get(j),1);
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(map.containsKey(matrix.get(i).get(j)) && map.get(matrix.get(i).get(j))==i){
                    map.put(matrix.get(i).get(j),i+1);
                    if(i == n - 1 )
                        res.add(matrix.get(i).get(j));
                }
            }
        }
        return res;
            
    }
}