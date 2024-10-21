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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int index=length-n;
        
        ListNode tempNew=head;
        if(index==0){
            return head.next;
        }
        while(index!=0){
            
            index--;
            if(index==0){
                tempNew.next=tempNew.next.next;
            }
            tempNew=tempNew.next;
        }
        
        
        return head;
        
        
    }
}