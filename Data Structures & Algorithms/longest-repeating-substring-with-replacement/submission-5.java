class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int mostFrequent = 0;
        int l = 0;

        HashMap<Character, Integer> count = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            //mostFrequent = 0;
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            for (Character key : count.keySet()) {
                mostFrequent = Math.max(mostFrequent, count.get(key));
            }
            while (r - l + 1 - mostFrequent > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
                mostFrequent = 0;
                for (Character key : count.keySet()) {
                    mostFrequent = Math.max(mostFrequent, count.get(key));
                }
            }

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
