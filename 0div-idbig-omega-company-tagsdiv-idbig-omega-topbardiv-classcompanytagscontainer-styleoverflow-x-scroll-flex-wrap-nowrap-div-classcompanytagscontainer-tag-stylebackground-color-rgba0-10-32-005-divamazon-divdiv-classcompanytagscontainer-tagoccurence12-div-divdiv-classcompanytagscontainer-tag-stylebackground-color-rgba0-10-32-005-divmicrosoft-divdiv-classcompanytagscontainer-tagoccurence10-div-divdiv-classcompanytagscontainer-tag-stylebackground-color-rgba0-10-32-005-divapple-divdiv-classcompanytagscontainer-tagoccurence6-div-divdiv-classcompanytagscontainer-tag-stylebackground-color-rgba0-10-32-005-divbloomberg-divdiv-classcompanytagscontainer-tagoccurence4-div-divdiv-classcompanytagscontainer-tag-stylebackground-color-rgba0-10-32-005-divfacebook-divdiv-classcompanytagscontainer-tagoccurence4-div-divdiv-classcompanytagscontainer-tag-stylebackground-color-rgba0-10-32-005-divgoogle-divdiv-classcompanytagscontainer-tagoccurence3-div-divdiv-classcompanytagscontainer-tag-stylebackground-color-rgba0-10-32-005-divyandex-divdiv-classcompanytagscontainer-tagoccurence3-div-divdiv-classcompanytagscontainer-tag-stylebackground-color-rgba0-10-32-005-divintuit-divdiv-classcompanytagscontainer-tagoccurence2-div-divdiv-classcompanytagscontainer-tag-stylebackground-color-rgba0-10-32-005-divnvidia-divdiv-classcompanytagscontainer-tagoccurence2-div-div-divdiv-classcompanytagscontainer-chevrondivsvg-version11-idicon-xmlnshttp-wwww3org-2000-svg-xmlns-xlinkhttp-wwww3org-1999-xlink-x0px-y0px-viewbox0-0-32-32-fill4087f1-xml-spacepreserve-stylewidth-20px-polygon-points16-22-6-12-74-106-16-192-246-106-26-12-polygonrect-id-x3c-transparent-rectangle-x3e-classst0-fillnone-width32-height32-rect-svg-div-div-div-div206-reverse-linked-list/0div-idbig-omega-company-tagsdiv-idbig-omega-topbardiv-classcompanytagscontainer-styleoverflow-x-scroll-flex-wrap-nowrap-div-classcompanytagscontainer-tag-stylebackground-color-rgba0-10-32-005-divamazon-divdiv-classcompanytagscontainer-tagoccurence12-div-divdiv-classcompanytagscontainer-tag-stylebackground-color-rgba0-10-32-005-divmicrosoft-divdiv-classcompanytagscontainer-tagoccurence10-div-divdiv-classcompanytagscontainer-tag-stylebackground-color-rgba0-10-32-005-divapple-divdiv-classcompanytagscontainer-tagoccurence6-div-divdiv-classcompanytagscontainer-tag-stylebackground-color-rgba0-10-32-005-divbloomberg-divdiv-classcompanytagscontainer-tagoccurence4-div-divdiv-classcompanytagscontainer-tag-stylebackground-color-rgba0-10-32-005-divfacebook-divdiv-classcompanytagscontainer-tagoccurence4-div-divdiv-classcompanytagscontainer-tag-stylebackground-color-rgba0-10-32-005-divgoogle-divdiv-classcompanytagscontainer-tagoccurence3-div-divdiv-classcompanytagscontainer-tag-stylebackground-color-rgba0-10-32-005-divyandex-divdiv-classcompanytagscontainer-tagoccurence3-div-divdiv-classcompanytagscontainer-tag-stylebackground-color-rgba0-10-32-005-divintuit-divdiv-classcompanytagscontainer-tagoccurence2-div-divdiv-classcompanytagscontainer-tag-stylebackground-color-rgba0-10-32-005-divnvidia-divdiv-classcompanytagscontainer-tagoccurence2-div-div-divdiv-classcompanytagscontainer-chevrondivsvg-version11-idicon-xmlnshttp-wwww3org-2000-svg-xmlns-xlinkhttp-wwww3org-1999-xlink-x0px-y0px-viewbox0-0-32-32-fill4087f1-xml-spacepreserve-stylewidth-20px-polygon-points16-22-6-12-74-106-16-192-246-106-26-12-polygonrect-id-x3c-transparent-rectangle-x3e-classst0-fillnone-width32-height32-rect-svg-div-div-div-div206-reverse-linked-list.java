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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode nextPtr=head;
         if(head==null)
            return null;
        while(nextPtr!=null){
            ListNode temp=head;
            nextPtr=head.next;
            head.next=prev;
            prev=temp;
            head=nextPtr;
        }
        return prev;
        
    }
    
}