class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] freq = new int[26];
            char[] charArray = str.toCharArray();
            for (char c : charArray) {
                freq[c - 'a']++;
            }

            String alphabet = Arrays.toString(freq);

            if (!map.containsKey(alphabet)) {
                map.put(alphabet, new ArrayList<>());
            } 
            map.get(alphabet).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
