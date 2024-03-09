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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode dummyPtr=dummy;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                dummyPtr.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else if(list2.val<list1.val){
                dummyPtr.next=new ListNode(list2.val);
                list2=list2.next;
            }
            else{
                dummyPtr.next=new ListNode(list1.val);
                dummyPtr=dummyPtr.next;
                dummyPtr.next=new ListNode(list1.val);
                list1=list1.next;
                list2=list2.next;
            }
            dummyPtr=dummyPtr.next;
        }
        if(list1!=null){
            dummyPtr.next=list1;
        }
        if(list2!=null){
            dummyPtr.next=list2;
        }
        return dummy.next;
        
    }
}