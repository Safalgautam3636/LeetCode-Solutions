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
        int counter=0;
        
        ListNode copyHead=new ListNode(-1);
        copyHead.next=head;
        while(head!=null){
            counter++;
            head=head.next;
        }
        System.out.println(counter-n);
        
        head=copyHead.next;
        counter=counter-n;
        if(counter==0){
            return head.next;
        }
        while(head!=null){
            counter--;
            if(counter==0){
                head.next=head.next.next;
            }
            else{
                head=head.next;
            }
            
            
        }
        return copyHead.next;
    }
}