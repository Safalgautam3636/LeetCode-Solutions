class Solution {
    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // To track the end of the first half
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
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
        if (head == null || head.next == null) {
            return;
        }
        
        ListNode mid = findMid(head);
        ListNode secondHalfReversed = reverse(mid);
        head = merge(head, secondHalfReversed);
    }
}
