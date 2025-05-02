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


//Optimized brute force by using hashing

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//         HashSet<ListNode> set = new HashSet<>();

//         while(headA != null){
//             set.add(headA);
//             headA = headA.next;
//         }
//         while(headB != null){
//             if(set.contains(headB)){
//                 return headB;
//             }
//             headB = headB.next;
//         }

//         return null;
        
//     }
// }


//third approach by size difference

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int diff = findDifference(headA, headB);

        if(diff < 0){

            while(diff != 0){
                headB = headB.next;
                diff++;
            }

        }

        else{
            while(diff != 0){
                headA = headA.next;
                diff--;
            }
        }
        

        while(headA != null){
            if(headA == headB){
                return headB;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public static int findDifference(ListNode headA, ListNode headB){

        int l1 = 0;
        int l2 = 0;

        while(headA != null || headB != null){

            if(headA != null){
                l1++;
                headA = headA.next;
            }
            if(headB != null){
                l2++;
                headB = headB.next;
            }
        }
        return l1-l2;
    }
}