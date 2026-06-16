class Solution {
    public int removeElement(int[] nums, int val) {
        int back = nums.length - 1;
        int i = 0;
        while (i <= back) {
            if (nums[i] == val) {
                nums[i] = nums[back];
                back--;
            } else {
                i++;
            }
        }
        return back + 1;
    }
}