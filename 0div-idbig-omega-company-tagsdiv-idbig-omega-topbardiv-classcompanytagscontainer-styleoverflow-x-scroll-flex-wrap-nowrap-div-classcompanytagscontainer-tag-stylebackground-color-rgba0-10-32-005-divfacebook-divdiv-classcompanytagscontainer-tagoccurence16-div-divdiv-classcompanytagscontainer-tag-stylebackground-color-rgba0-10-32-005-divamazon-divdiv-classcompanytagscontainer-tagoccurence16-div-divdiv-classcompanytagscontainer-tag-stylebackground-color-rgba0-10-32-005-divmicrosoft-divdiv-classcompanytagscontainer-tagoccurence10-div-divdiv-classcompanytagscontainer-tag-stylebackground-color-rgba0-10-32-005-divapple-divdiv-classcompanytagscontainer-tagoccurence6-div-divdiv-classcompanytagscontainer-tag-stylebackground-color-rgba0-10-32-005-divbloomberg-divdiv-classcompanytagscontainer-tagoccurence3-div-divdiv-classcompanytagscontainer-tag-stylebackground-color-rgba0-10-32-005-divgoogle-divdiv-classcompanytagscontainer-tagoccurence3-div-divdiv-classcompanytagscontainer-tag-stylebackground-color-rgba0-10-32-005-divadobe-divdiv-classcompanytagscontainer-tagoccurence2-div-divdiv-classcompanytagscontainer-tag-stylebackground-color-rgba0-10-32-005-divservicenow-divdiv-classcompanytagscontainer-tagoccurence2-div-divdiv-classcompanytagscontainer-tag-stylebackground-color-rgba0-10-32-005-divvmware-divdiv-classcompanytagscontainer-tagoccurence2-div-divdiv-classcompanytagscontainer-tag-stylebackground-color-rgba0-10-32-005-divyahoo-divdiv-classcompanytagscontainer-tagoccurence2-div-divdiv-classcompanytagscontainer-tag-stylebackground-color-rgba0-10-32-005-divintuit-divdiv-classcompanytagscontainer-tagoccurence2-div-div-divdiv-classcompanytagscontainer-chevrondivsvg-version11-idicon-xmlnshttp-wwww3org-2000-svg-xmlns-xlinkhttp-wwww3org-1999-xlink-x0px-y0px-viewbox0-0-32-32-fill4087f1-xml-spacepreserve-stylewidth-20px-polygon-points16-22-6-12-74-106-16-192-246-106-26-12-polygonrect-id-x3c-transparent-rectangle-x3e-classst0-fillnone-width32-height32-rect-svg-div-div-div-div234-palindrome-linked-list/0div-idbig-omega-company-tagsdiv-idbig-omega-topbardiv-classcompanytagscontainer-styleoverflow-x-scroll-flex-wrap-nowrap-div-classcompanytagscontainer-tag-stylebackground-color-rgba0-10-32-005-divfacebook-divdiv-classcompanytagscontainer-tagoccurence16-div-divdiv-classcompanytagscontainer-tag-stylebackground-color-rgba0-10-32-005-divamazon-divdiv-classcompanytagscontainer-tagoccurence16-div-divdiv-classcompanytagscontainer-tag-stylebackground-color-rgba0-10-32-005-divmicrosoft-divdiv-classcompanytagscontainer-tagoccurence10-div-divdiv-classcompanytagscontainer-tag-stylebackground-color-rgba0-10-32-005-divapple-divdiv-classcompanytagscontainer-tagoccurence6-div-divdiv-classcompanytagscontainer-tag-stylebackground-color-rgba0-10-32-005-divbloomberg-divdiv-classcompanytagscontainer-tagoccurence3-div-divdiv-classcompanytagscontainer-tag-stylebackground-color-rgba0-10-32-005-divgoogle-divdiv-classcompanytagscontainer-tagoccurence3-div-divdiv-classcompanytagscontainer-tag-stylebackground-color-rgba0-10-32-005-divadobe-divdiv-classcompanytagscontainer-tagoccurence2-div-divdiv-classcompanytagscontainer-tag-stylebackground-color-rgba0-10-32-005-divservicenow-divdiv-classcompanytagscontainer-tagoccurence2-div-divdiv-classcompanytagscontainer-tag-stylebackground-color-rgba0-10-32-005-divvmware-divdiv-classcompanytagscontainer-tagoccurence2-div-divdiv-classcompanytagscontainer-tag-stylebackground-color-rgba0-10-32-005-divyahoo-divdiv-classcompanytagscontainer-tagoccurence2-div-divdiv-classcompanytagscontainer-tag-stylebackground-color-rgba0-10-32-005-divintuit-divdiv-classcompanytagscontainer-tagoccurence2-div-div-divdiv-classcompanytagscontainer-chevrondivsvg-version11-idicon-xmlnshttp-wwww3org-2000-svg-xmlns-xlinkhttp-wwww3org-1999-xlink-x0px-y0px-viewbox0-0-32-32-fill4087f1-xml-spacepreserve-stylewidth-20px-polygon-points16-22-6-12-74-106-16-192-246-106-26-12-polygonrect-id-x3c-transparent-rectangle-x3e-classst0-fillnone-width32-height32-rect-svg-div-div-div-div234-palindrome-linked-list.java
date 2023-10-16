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
        ListNode temp=new ListNode(-1);
        temp.next=head;
        ListNode head1=copy(head);
        ListNode reverseLL=reverse(temp.next);
        while(reverseLL!=null&&head1!=null){
            if(reverseLL.val!=head1.val){
                return false;
            }
            reverseLL=reverseLL.next;
            head1=head1.next;
        }
        return true;
    }
     ListNode copy(ListNode head) {
        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        head = head.next;
        
        while (head != null) {
            current.next = new ListNode(head.val);
            current = current.next;
            head = head.next;
        }
        
        return newHead;
    }

    ListNode reverse(ListNode head){
        
        ListNode prev=null;
        ListNode next=head;
        while(next!=null){
            ListNode temp=head;
            next=head.next;
            
            head.next=prev;
            prev=temp;
            head=next;
            
            
        }
        return prev;
    }
}