
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
    private ListNode findMid(ListNode head){
        
        ListNode copyHead=head;
        ListNode slow=copyHead;
        ListNode fast=copyHead;
        ListNode track=copyHead;
        while(fast!=null&&fast.next!=null){
            track=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        track.next=null;
        return slow;
    }
    private ListNode reverse(ListNode head){
        ListNode copyHead=head;
        ListNode prev=null;
        ListNode last=head;
        while(copyHead!=null){
            last=copyHead.next;
            copyHead.next=prev;
            prev=copyHead;
            copyHead=last;
        }
        return prev;
        
    }
    private ListNode merge(ListNode head1,ListNode head2){
        ListNode copyHead1=head1;
        ListNode copyHead2=head2;
        ListNode store=new ListNode(-1);
        ListNode dummyNode=store;
        while(copyHead1!=null&&copyHead2!=null){
            dummyNode.next=copyHead1;
            dummyNode=dummyNode.next;
            copyHead1=copyHead1.next;
            
            dummyNode.next=copyHead2;
            dummyNode=dummyNode.next;
            copyHead2=copyHead2.next;
        }
        if(copyHead1!=null){
            dummyNode.next=copyHead1;
        }
        if(copyHead2!=null){
            dummyNode.next=copyHead2;
        }
        return dummyNode.next;
    }
    public void reorderList(ListNode head) {
        // find mid 
        // reverse last part
        //first from first list and second from second list
        if(head==null||head.next==null)return;
        ListNode mid=findMid(head);
        ListNode reverseFromMid=reverse(mid);
        
        head=merge(head,reverseFromMid);
    }
}

