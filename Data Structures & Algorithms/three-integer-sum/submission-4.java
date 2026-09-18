class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        //Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int target = 0 - nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] > target) {
                    r--;
                } else if (nums[l] + nums[r] < target) {
                    l++;
                } else {
                    ArrayList<Integer> curr = new ArrayList<>(List.of(nums[i], nums[r], nums[l]));
                    if (!result.contains(curr)) {
                        result.add(curr);
                    }
                    l++;
                    r--;
                }
            }
        }

        return result;
    }
}
