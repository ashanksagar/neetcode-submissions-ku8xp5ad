class Solution {
    public int maxArea(int[] heights) {
        int first = 0;
        int second = heights.length - 1;

        int max = Math.min(heights[first], heights[second]) * (second - first);

        while (first < second) {
            if (heights[second] < heights[first]) {
                second--;
            } else {
                first++;
            }

            int currMax = Math.min(heights[first], heights[second]) * (second - first);
            max = Math.max(max, currMax);
        }

        return max;
    }
}
