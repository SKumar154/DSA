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
    public boolean hasCycle(ListNode head) {
        //Approach 1
        // Set<ListNode> set = new HashSet<>();
        // ListNode curr = head;

        // while(curr!=null){
        //     if(set.contains(curr)){
        //         return true;
        //     }
        //     set.add(curr);
        //     curr = curr.next;
        // }
        // return false;

        //Approach 2
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while(slow!=fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        return true;



    }
}