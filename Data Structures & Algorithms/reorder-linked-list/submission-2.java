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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;
        ListNode prev = null;
        while (mid != null) {
            ListNode tmp = mid.next;
            mid.next = prev;
            prev = mid;
            mid = tmp;
        }

        ListNode reverse = prev;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while (reverse.next != null) {
            ListNode temp = head.next;
            ListNode temp2 = reverse.next;
            head.next = reverse;
            reverse.next = temp;
            head = temp;
            reverse = temp2;

        }


    }
}
