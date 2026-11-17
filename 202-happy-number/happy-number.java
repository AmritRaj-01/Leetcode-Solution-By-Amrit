class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> store = new HashSet<>();
        while (n != 1 && !store.contains(n)) {
            store.add(n);
            int sum=0;
            while(n!=0){
                int digit=n%10;
                sum+=digit*digit;
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
}