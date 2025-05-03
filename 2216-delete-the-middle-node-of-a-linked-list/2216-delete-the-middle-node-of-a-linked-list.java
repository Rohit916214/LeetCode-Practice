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

    public static ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = head;

        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return pre;
    }

    public ListNode deleteMiddle(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }

        ListNode midbefore = findMid(head);

        midbefore.next = midbefore.next.next;

        

        return head;
    }
}