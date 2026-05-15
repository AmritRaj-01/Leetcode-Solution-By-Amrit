class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            if (freq.get(ch) == 1) {
                q.add(i);
            }

  
            while (!q.isEmpty() && freq.get(s.charAt(q.peek())) > 1) {
                q.poll();
            }
        }

        return q.isEmpty() ? -1 : q.peek();
    }
}
