/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        if (intervals.isEmpty()) {
            return true;
        }

        int max = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (curr.start < max) {
                return false;
            }
            max = curr.end;
        }

        return true;
    }
}
