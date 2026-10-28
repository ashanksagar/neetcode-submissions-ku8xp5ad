class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        int l = 0;

        HashSet<Character> seen = new HashSet<>();
        char[] c = s.toCharArray();
        for (int r = 0; r < s.length(); r++) {
            while (seen.contains(c[r])) {
                seen.remove(c[l]);
                l++;
            }
            seen.add(c[r]);
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
