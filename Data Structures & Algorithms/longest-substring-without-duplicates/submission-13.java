class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;

        int max = 0;
    

        Set<Character> set = new HashSet<>();
        

        while (r < s.length()) {
            if (set.contains(s.charAt(r))) {
                while (set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }

                        max = Math.max(max, (r - l + 1));

            set.add(s.charAt(r));


            r++;
        }

        System.out.println(l + " " + r);
        return max;
    }
}
