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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        // Check if we have k nodes available
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count < k) return head;

        // Reverse k nodes
        ListNode prev = null;
        curr = head;
        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Recurse on the remaining list
        head.next = reverseKGroup(curr, k);

        return prev; // New head after reversing
    }
}