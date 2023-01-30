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
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode first=sortList(head);
        ListNode second=sortList(mid);
        return merge(first,second);
        
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode copy=new ListNode(-1);
        ListNode ret=copy;
        while(head1!=null&&head2!=null){
            if(head1.val<head2.val){
                copy.next=new ListNode(head1.val);
                head1=head1.next;
                copy=copy.next;
            }
            else if(head1.val>head2.val){
                copy.next=new ListNode(head2.val);
                head2=head2.next;
                copy=copy.next;
            }
            else{
                copy.next=new ListNode(head1.val);
                copy.next.next=new ListNode(head1.val);
                head1=head1.next;
                head2=head2.next;
                copy=copy.next.next;
            }
        }
        if(head1!=null){
            copy.next=head1;
        }
        if(head2!=null){
            copy.next=head2;
        }
        return ret.next;
    }
    public ListNode getMid(ListNode head){
        ListNode prevslow=head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            prevslow=slow;
            slow=slow.next;
        }
        prevslow.next=null;
        return slow;
    }
}