class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character, Integer> c = new HashMap<>();
        int n = sentence.length();
        for (int i = 0; i < n; i++) {
            char ch = sentence.charAt(i);

            if (c.containsKey(ch)) {
                c.put(ch, c.get(ch) + 1);
            } else {
                c.put(ch, 1);
            }
        }
        if (c.size() == 26) {
            return true;
        }
        return false;
    }
}