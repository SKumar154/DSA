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
        
        ListNode dummy = new ListNode(0);
        dummy.next=head;

        ListNode curr = head;
        int count=0;

        ListNode beforeGroup = dummy;

        while(curr!=null){
            count++;
            if(count%k==0){
                ListNode groupStart = beforeGroup.next;
                ListNode nextHead = curr.next;
                curr.next=null;
                
                ListNode reversedHead = reverseList(groupStart);

                beforeGroup.next = reversedHead;
                groupStart.next = nextHead;
                beforeGroup = groupStart;
                curr=nextHead;
            }else{
                curr=curr.next;
            }
        }
        return dummy.next;
    }
    public ListNode reverseList(ListNode pHead){

        ListNode prev=null;
        ListNode curr=pHead;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}