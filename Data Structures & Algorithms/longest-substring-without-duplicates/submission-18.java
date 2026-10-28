class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        int l = 0;

        HashSet<Character> seen = new HashSet<>();
        int curr = 0;
        char[] c = s.toCharArray();
        for (int r = 0; r < s.length(); r++) {
            while (seen.contains(c[r])) {
                seen.remove(c[l]);
                l++;
                curr--;
            }
            seen.add(c[r]);
            curr++;
            max = Math.max(max, curr);
        }

        return max;
    }
}
