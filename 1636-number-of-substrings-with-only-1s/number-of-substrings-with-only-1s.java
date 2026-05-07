class Solution {
    public int numSub(String s) {
        final int MOD = 1_000_000_007;
        int n=s.length();
        long c=0;
        long sS=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                c++;
                sS+= c;
                sS=sS%MOD;
            }else{
                c=0;
            }
            
        }
        return (int) sS;
    }
}