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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondPart=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode nextPtr=secondPart;
        while(nextPtr!=null){
            nextPtr=secondPart.next;
            secondPart.next=prev;
            prev=secondPart;
            secondPart=nextPtr;
        }
        slow = prev;
        ListNode first=head;
        ListNode firstSecond=prev;
        while(firstSecond!=null){
            ListNode temp1=first.next;
            ListNode temp2=firstSecond.next;
            first.next=firstSecond;
            firstSecond.next = (temp1 != null) ? temp1 : firstSecond.next; 
            first=temp1;
            firstSecond=temp2;
        }
        
    }
}