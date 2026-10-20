class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];

        int curr = 0;

        //add all intervals before new interval 
        while (curr < intervals.length && intervals[curr][1] < start) {
            res.add(intervals[curr]);
            curr++;
        }

        while (curr < intervals.length && intervals[curr][1] >= start && intervals[curr][0] <= end) {
            start = Math.min(intervals[curr][0], start);
            end = Math.max(intervals[curr][1], end);
            curr++;
        }

        res.add(new int[] {start, end});

        while(curr < intervals.length) {
            res.add(intervals[curr]);
            curr++;
        }

        return res.toArray(new int[res.size()][]);
    }
}

