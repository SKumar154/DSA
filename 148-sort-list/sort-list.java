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
    public ListNode sortList(ListNode head) {
        
        ArrayList<Integer> list = new ArrayList<>();

        ListNode curr = head;

        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        int n=list.size();
        Collections.sort(list);

        ListNode replace = head;
        for(int i=0;i<n;i++){
            replace.val=list.get(i);
            replace=replace.next;
        }
        return head;
    }
}