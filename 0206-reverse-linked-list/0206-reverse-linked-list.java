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
    static ListNode ptr=null;
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode ans=new ListNode(0);
        reverseLL(head,ans);
        return ans.next;
        
       
    }
    private ListNode reverseLL(ListNode head,ListNode ans){
        if(head.next==null){
            ans.next=head;
            return head;
        }
        ListNode store=reverseLL(head.next,ans);
        System.out.println(store.val+""+head.val);
        
        store.next=head;
        head.next=null;
        store=head;
        return head;
    }
}