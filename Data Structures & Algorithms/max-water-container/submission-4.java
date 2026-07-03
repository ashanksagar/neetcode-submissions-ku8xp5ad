class Solution {
    public int maxArea(int[] heights) {
        int first = 0;
        int second = heights.length - 1;
        int maxArea = (second - first) * Math.min(heights[first], heights[second]);

        while (first < second) {
            if (heights[first] < heights[second]) {
                first++;
            } else {
                second--;
            }
            int currArea = (second - first) * Math.min(heights[first], heights[second]);
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
}
