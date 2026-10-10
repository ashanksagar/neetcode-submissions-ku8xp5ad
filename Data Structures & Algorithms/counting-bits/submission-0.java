class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int j = i;
            while (j != 0) {
                res[i] += (j & 1) == 1 ? 1 : 0;
                j >>= 1;
            }
        }
        return res;
    }
}
