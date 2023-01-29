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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        if(temp==null)return null;
        while(temp.next!=null){
            if(temp.next.val==temp.val){
                temp.next=temp.next.next;
                if(temp.next==null){
                    return head;
                }
            }
            else{
                temp=temp.next;
                if(temp==null)
                {
                   return head;
                }
            }
        }
        return head;
    }
}