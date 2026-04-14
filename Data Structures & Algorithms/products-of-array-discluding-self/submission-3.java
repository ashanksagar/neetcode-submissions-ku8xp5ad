class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 0) zeroCount++;
        }
        if (zeroCount > 1) {
            return new int[nums.length];
        }

        int sum = 1;
        boolean zero = false;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                sum = sum * nums[i];
            } else {
                zero = true;
            }
        }

        int[] res = new int[nums.length];
        
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 0) {
                res[i] = sum;
            } else if (zero) {
                res[i] = 0;
            } else {
                res[i] = sum / nums[i];   
            }
        }

        return res;
    }
}  
