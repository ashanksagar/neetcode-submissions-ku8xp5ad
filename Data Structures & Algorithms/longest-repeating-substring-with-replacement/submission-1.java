class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int res = 0;
        int maxFreq = 0;

        Map<Character, Integer> count = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {

            char c = s.charAt(r);

            count.put(c, count.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, count.get(c));

            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);

                count.put(leftChar, count.get(leftChar) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}