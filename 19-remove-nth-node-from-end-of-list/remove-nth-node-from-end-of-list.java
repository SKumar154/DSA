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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode curr = head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int del = size - n;
        if(del==0){
            ListNode temp = head;
            head=head.next;
            return head;
        }

        curr=head;
        for(int i=0;i<del-1;i++){
            curr=curr.next;
        }
        if(curr==null || curr.next==null){
            return null;
        }
        curr.next=curr.next.next;

        return head;
    }
}