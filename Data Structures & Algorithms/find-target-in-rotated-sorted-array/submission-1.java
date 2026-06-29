class Solution {
    public int search(int[] nums, int target) {
        int l  = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l)/2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        if (nums[l] == target) {
            return l;
        }
        
        int res = binarySearch(nums, target, 0, l);
        if (res != -1) {
            return res;
        }
        return binarySearch(nums, target, l + 1, nums.length - 1);
   
    }

    public int binarySearch(int [] nums, int target, int start, int end) {
        int l = start;
        int r = end;

        while (l <= r) {
            int m = l + (r - l)/2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
