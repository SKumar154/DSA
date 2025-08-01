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
    public boolean isPalindrome(ListNode head) {
        //Approach 1
        // List<Integer> list = new ArrayList<>();

        // ListNode curr=head;
        // while(curr!=null){
        //     list.add(curr.val);
        //     curr=curr.next;
        // }
        // int left=0;
        // int right=list.size()-1;
        // while(left<right){
        //     if(list.get(left)!=list.get(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;

        //Approach 2
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null;
        ListNode curr=slow.next;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        boolean isPalindrome=true;
        ListNode temp=head;

        while(isPalindrome && prev!=null){
            if(temp.val!=prev.val){
                isPalindrome=false;
            }
            temp=temp.next;
            prev=prev.next;
        }
        return isPalindrome;
    }
}