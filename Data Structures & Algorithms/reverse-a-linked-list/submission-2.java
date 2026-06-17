/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        ListNode curr = head;
        stack.push(curr.val);
        while (curr.next != null) {
            curr = curr.next;
            stack.push(curr.val);
        }
        ListNode res = new ListNode(stack.pop());
        ListNode point = new ListNode(0, res);

        while (!stack.isEmpty()) {
            res.next = new ListNode(stack.pop());
            res = res.next;
        }
        return point.next;
    }
}
