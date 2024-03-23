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
    
    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while (head1 != null || head2 != null) {
            if (head1 != null) {
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            }
            if (head2 != null) {
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }
        return dummy.next;
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
