/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //Approach 1
        // Set<ListNode> set = new HashSet<>();

        // ListNode curr = head;

        // while(curr!=null){
        //     if(set.contains(curr)){
        //         return curr;
        //     }
        //     set.add(curr);
        //     curr=curr.next;
        // }
        // return null;

        //Approach 2 (Fast and slow pointer)
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                break;
            }
        }
        if(fast == null || fast.next==null){
            return null;
        }
        ListNode temp = head;

        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return temp;
    }
}