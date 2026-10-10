class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        List<Integer> binary = new ArrayList<>();
        while (n > 0) {
            binary.add(n % 2);
            n = n/2;
        }

        for (int num : binary) {
            if (num == 1) {
                count++;
            }
        }

        return count;
    }
}
