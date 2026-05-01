class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int score=0;
        for(int i=0;i<n-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            int diff=Math.abs(ch1-ch2);
            score += diff;

        }
        return score ;
    }
}