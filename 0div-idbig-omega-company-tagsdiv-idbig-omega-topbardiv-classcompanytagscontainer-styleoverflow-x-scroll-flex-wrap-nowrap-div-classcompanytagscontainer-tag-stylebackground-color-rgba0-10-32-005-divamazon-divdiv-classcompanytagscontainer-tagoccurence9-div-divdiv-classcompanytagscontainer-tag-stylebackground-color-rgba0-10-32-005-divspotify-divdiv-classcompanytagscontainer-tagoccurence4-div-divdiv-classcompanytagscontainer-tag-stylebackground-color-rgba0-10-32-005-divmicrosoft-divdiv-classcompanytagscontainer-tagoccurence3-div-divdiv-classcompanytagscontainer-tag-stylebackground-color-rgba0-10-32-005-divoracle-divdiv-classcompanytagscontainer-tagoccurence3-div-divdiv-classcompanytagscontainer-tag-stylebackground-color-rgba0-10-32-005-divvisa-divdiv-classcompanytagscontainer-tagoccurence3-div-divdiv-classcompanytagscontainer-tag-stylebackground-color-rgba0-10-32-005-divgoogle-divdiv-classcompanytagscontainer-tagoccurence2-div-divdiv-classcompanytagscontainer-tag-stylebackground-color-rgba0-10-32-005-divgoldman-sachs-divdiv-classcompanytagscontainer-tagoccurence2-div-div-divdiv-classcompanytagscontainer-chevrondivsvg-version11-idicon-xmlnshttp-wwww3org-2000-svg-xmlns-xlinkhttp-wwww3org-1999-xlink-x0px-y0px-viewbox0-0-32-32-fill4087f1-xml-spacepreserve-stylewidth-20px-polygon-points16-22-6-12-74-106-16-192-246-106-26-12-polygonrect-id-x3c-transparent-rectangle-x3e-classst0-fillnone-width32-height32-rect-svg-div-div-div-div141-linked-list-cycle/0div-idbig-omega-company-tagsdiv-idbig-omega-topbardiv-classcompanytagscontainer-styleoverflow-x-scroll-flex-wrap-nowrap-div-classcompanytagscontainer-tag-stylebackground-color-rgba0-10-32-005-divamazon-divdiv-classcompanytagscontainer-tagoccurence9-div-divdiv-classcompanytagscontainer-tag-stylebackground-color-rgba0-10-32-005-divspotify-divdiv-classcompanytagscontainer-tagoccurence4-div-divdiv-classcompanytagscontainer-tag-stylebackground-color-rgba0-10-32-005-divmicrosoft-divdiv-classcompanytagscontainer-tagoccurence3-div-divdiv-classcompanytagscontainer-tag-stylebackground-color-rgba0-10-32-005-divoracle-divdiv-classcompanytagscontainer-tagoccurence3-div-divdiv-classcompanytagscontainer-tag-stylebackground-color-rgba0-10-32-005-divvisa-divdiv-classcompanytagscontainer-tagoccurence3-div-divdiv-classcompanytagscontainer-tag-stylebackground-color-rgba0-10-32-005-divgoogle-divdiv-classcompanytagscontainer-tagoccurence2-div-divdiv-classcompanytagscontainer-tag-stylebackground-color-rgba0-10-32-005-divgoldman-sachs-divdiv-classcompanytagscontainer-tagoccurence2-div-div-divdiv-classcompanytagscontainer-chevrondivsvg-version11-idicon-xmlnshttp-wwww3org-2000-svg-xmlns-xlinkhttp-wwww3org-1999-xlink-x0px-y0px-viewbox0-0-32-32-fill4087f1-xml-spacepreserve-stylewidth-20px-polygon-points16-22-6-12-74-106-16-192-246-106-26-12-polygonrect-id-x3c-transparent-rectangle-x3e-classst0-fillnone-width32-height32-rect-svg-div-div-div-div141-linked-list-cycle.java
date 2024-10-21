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
        if(head==null||head.next==null)return false;
        ListNode fastPtr=head.next;
        ListNode slowPtr=head;
        while(fastPtr!=null&&fastPtr.next!=null){
            if(slowPtr==fastPtr){
                return true;
            }
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            
        }
        return false;
        
    }
}