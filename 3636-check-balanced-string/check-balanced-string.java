class Solution {
    public boolean isBalanced(String num) {
        int n=num.length();
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            int digit=num.charAt(i)-'0';
            if(i%2==0) {
                sum1+=digit;
            }else{
                sum2+=digit;
            }
        }
        return sum1 == sum2;
    }
}