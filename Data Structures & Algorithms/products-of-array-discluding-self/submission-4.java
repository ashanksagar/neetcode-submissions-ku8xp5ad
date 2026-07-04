class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = nums[0];
        int zeroCount = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product = product * nums[i];  
            }
        }

        if (zeroCount > 1) {
            return new int[nums.length];
        }

        int[] res = new int[nums.length];

        for (int j = 0; j < nums.length; j++) {
            if (zeroCount > 0) {
                if (nums[j] == 0) {
                    res[j] = product;
                } else {
                    res[j] = 0;
                }
            } else {
                res[j] = product/nums[j];
            }
        }

        return res;
    }
}  
