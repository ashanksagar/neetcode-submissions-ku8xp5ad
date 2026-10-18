class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];   
        int insert = 0;

        List<int[]> result = new ArrayList<>();

        boolean inserted = false;

        for (int i = 0; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if (start <= currEnd && end >= currStart) {
                start = Math.min(start, currStart);
                end = Math.max(end, currEnd);
                continue;
            } else if (currStart > end && inserted == false) {
                result.add(new int[]{start, end});
                inserted = true; 
            }
            result.add(new int[]{currStart, currEnd});
            
        }

        if (!inserted) {
            result.add(new int[]{start, end});
        }

        int[][] res = new int[result.size()][2];

        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }

        return res;

    }
}
