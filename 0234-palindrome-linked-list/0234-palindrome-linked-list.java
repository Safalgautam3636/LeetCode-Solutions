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
    ListNode start=null;
    public boolean isPalindrome(ListNode head) {
        if(start==null){
            start=head;
        }
        if(head==null){
            return true;
        }
        
        boolean store=isPalindrome(head.next);
        
        if(head.val!=start.val){
            return false;
        }
        start=start.next;
        return store;
    }
}