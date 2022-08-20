class Solution {
    ArrayList<String> res=new ArrayList<>();
    public ArrayList<String> genIp(String s) {
        int n=s.length();
        for(int i=1;i<=n-3;i++){
            for(int j=1;j<=n-2;j++){
                for(int k=1;k<=n-1;k++){
                    find(s,i,j,k);
                }
            }
        }
        return res;
    }
    private void find(String s,int i,int j,int k){
        if(i>s.length() || i+j>s.length() || i+j+k>s.length()){
            return;
        }
        String s1=s.substring(0,i);
        String s2=s.substring(i,i+j); if(s2.isEmpty()) s2="0";
        String s3=s.substring(i+j,i+j+k); if(s3.isEmpty()) s3="0";
        String s4=s.substring(i+j+k,s.length());
        if(check(s1) && check(s2) && check(s3) && check(s4)){
            res.add(s1+"."+s2+"."+s3+"."+s4);
        }
        return;
    }
    private boolean check(String s){
        if(s.isEmpty()) return false;
        if(s.length()>3) return false;
        if(s.length()>1 && s.charAt(0)=='0') return false;
        int n=Integer.parseInt(s);
        if(n>=0 && n<=255) return true;
        return false;
    }
}