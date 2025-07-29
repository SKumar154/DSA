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
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode curr = head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int midpt = size/2;
        curr=head;
        for(int i=0;i<midpt-1;i++){
            curr=curr.next;
        }
        if(curr==null || curr.next==null){
            return null;
        }
        curr.next = curr.next.next;
        return head;
    }
}