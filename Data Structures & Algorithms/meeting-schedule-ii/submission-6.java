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
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //add one end time per meeting to the min heap
        //if multiple end times add the latest one

        for (Interval i : intervals) {
            int start = i.start;
            int end = i.end;

            //if overlap (starts before earliest end) then add the new end time

            //[0, 4] [4, 9] [5, 10] [7, 12]
            if (!pq.isEmpty() && start >= pq.peek()) {
                pq.poll();
            } 
            pq.offer(end);

            

        }

        return pq.size();
    }
}
