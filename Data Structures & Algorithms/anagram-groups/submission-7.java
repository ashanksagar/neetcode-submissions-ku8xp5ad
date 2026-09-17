class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> map = new HashMap();

        for (String s : strs) {
            int[] freq = new int[26];

            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            String freqStr = Arrays.toString(freq);

            if (map.get(freqStr) == null) {
                map.put(freqStr, new ArrayList<>());
            }
      
            map.get(freqStr).add(s);
        }

        return new ArrayList<>(map.values());

    }
}
