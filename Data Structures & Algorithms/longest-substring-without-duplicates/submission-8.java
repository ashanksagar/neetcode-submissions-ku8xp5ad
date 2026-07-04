class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int res = 0;
        Set<Character> curr = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            while (curr.contains(s.charAt(r))) {
                curr.remove(s.charAt(l));
                l++;
            }
            curr.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }

        return res;

    }
}
