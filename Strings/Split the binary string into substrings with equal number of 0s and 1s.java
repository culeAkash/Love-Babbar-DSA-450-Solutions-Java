class Solution {
    public static int maxSubStr(String str) {
       int n = str.length();
       if(n==1)
        return -1;
       
       int count0 = 0;
       int count1 = 0;
       int count = 0;
        
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0')
                count0++;
            else
                count1++;
                
            if(count0!=0 && count0==count1){
                count++;
                count0= 0;
                count1= 0;
            }
        }
        
        if(count0!=0 || count1!=0)
            return -1;
        
        return count;
    }
}