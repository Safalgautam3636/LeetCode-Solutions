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
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode newNode1=new ListNode(0);
//         ListNode newNode=newNode1;
//         while(list1!=null&&list2!=null){
//             if(list1.val<list2.val){
//                 newNode.next=new ListNode(list1.val);
//                 list1=list1.next;
//             }
//             else{
//                 newNode.next=new ListNode(list2.val);
//                 list2=list2.next;
//             }
//             newNode=newNode.next;
//         }
//         if(list1!=null){
//             newNode.next=list1;
//             newNode=newNode.next;
            
//         }
//         if(list2!=null){
//             newNode.next=list2;
//             newNode=newNode.next;
//         }
//         return newNode1.next;
//     }
// }
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode1=new ListNode(0);
        ListNode newNode=newNode1;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                newNode1.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else{
                newNode1.next=new ListNode(list2.val);
                list2=list2.next;
            }
            newNode1=newNode1.next;
        }
        if(list1!=null){
            newNode1.next=list1;
            
        }
        if(list2!=null){
            newNode1.next=list2;
        }
        return newNode.next;
    }
}