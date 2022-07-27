class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        
        for(int num1:nums1){
            for(int num2:nums2){
                if(num1==num2)
                    set.add(num1);
            }
        }
        
        int[] res = new int[set.size()];
        int k = 0;
        for(int num:set)
            res[k++] = num;
        
        return res;
        
    }
}