class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int maxLength=0;
        Set<Character> st=new HashSet<>();
        for(int r=0;r<n;r++){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            maxLength=Math.max(maxLength,r-l+1);
        }
        return maxLength;
    }
}