class Solution {
    public int findLucky(int[] arr) {
        int[] frequencyCount = new int[501];
        for (int number : arr) {
            frequencyCount[number]++;
        }
        for (int i = frequencyCount.length - 1; i > 0; i--) {
            if (i == frequencyCount[i]) {
                return i;
            }
        }
        return -1;
    }
}