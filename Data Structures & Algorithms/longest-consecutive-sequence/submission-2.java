class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int i : nums) {
            map.add(i);
        }

        int longest = 0;

        for (int i : map) {
            if (!map.contains(i - 1)) {
                int length = 1;
                while (map.contains(i + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;

    }
}
