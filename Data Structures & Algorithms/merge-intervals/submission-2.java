class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int min = intervals[0][0];
        int max = intervals[0][1];

        List<int[]> res = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (start <= max) {
                min = Math.min(start, min);
                max = Math.max(max, end);
                continue;
            } else {
                res.add(new int[]{min, max});
                min = start;
                max = end;
            }

        }
        res.add(new int[]{min, max});

        return res.toArray(new int[res.size()][]);
    }
}
