/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 // Brute force method


// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//         while(headA != null){
//             ListNode temp = headB;

//             while(temp != null){
//                 if(temp == headA){
//                     return headA;
//                 }
//                 temp = temp.next;
//             }
//             headA = headA.next;
//         }

//         return null;
        
//     }
// }


//Optimized

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> set = new HashSet<>();

        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }

        return null;
        
    }
}