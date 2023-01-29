/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null){
            return false;
        }
        do{
            if(fast.next==null||fast.next.next==null){
                return false;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        while(fast!=slow);
        
        return true;
    }
}