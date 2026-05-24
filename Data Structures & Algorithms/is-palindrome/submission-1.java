class Solution {
    public boolean isPalindrome(String s) {
        String original = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] originalArr = original.toCharArray();

        char[] reverseArr = new char[originalArr.length];

        int counter = 1;
        for (char i : originalArr) {
            reverseArr[reverseArr.length - counter] = i;
            counter++;
        }

        return Arrays.equals(reverseArr, originalArr);
    }
}
