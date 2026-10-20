class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int removed = 0;

        int max = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start < max) {
                removed++;
                max = Math.min(max, end);
            } else {
                max = end;
            }
        }


        return removed;
    }
}
