class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        int first = 0;
        int second = result.length() - 1;
        while (first < second) {
            if (!(result.charAt(first) == result.charAt(second))) {
                return false;
            }
            first++;
            second--;
        }

        return true;
    }
}
