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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1 = headA;
        int sizeA=0;
        while(curr1!=null){
            curr1=curr1.next;
            sizeA++;
        }

        ListNode curr2 = headB;
        int sizeB=0;
        while(curr2!=null){
            curr2 = curr2.next;
            sizeB++;
        }
        int steps = Math.abs(sizeA - sizeB);
        ListNode now1 = headA;
        ListNode now2 = headB;
        while(steps>0){
            if(sizeA > sizeB){
                now1=now1.next;
                steps--;
            } else{
                now2=now2.next;
                steps--;
            }
        }
        while(now1!=null && now2!=null){
            if(now1 == now2){
                return now1;
            }
            now1=now1.next;
            now2=now2.next;
        }
        return now1;

    }
}