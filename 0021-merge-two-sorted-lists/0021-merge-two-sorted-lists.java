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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode head=new ListNode(-1);
        ListNode ptr=head;
        while(head1!=null&&head2!=null){
            if(head1.val<head2.val){
                head.next=new ListNode(head1.val);
                head1=head1.next;
                head=head.next;
            }
            else if(head1.val>head2.val){
                head.next=new ListNode(head2.val);
                head2=head2.next;
                head=head.next;
            }
            else{
                head.next=new ListNode(head1.val);
                head.next.next=new ListNode(head2.val);
                head1=head1.next;
                head2=head2.next;
                head=head.next.next;
            }
        }
        if(head1!=null){
            head.next=head1;
        }
        if(head2!=null){
            head.next=head2;
        }
        return ptr.next;
    }
}