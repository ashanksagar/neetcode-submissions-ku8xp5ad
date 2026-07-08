class Solution {
    List<List<Integer>> res =  new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> sol = new ArrayList<>();
        backtrack(target, sol, 0, nums);

        return res;
    }

    public void backtrack(int target, List<Integer> sol, int i, int[] nums) {

        if (target == 0) {
            res.add(new ArrayList(sol));
            return;
        }
        if (target < 0 || i >= nums.length) {
            return;
        }

        sol.add(nums[i]);
        backtrack(target - nums[i], sol, i, nums);
        sol.remove(sol.size() - 1);
        backtrack(target, sol, i + 1, nums);

    }
}

