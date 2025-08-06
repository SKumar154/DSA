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
    public ListNode rotateRight(ListNode head, int k) {

        if (k == 0 || head == null || head.next == null) {
            return head;
        }

        // Step 1: Count the number of nodes
        int count = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            count++;
        }

        // Step 2: Make the list circular
        tail.next = head;

        // Step 3: Find the new tail: (count - k % count - 1) steps from head
        k = k % count;
        int n = count - k;
        ListNode newTail = head;

        for (int i = 1; i < n; i++) {
            newTail = newTail.next;
        }

        // Step 4: Break the circle and return new head
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
        
        // if(k==0 || head==null || head.next==null){
        //     return head;
        // }
        // int count=0;
        // ListNode now = head;
        // while(now!=null){
        //     now=now.next;
        //     count++;
        // }
        // k=k%count;
        // while(k>0){
        //     ListNode curr=head;
        //     ListNode pHead=head;
        //     ListNode prev=null;
        //     while(curr!=null && curr.next!=null){
        //         prev=curr;
        //         curr=curr.next;
        //     }
        //     curr.next=pHead;
        //     prev.next=null;
        //     head=curr;

        //     k--;
        // }
        // return head;
        
        // ListNode curr=head;
        // if(k==0 || head==null){
        //     return head;
        // }

        // ArrayList<Integer> list = new ArrayList<>();

        // while(curr!=null){
        //     list.add(curr.val);
        //     curr=curr.next;
        // }
        // k=k%n;
        // int n=list.size();
        // int[] res = new int[n];
        // int index=0;
        // for(int i=n-k;i<n;i++){
        //     res[index++]=list.get(i);
        // }
        // for(int j=0;j<n-k;j++){
        //     res[index++]=list.get(j);
        // }
        // ListNode replace = head;

        // for(int e=0;e<n;e++){
        //     replace.val = res[e];
        //     replace=replace.next;
        // }
        // return head;

    }
}