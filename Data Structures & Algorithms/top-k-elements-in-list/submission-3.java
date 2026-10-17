class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];

        Map<Integer, Integer> count = new HashMap<>();

        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
        (a, b) -> count.get(a) - count.get(b));

        for (int i : count.keySet()) {
            pq.offer(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }

        return res;
    }
}
