class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        ArrayList<String> ansStr = new ArrayList<>();
        solver(S,res,ansStr);
        return res;
    }
    
    static void solver(String str,ArrayList<ArrayList<String>> res,ArrayList<String> ansStr){
        if(str.length()==0)
        {
            res.add(new ArrayList<>(ansStr));
            return;
        }
        
        String tempStr="",ogStr="";
        for(int i=0;i<str.length();i++){
            tempStr += str.charAt(i);
            if(isPal(tempStr)){
                ansStr.add(tempStr);
                ogStr = str;
                str = str.substring(i+1);
                solver(str,res,ansStr);
                str = ogStr;
                ansStr.remove(ansStr.size()-1);
            }
        }
    }
    
    static boolean isPal(String str){
        int start = 0, end = str.length() -1;
        
        while(start<end){
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
};