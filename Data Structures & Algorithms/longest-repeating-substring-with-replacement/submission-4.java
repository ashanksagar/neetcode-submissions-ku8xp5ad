class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;

        int l = 0;
        //add some sort of character tracker
        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            

            int maxFreq = 0;
            for (int count : map.values()) {
                maxFreq = Math.max(maxFreq, count);
            }

            while ((r - l + 1) - maxFreq > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);

                l++;

                maxFreq = 0;
                for (int count : map.values()) {
                    maxFreq = Math.max(maxFreq, count);
                }
            }
            max = Math.max(r - l + 1, max);
        }

        return max;
    }
}
