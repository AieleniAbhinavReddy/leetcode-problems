class Solution {
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
        return;
    }
    ListNode slow = head;
    ListNode fast = head;
    ListNode middle_prev = null;
    while (fast != null && fast.next != null) {
        middle_prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode head1 = head;
    ListNode head2 = slow;
    if (middle_prev != null) {
        middle_prev.next = null;
    }
    head2 = reverse(head2);
    ListNode p1 = head1;
    ListNode p2 = head2;
    while (p1 != null && p2 != null) {
        ListNode next1 = p1.next;
        ListNode next2 = p2.next;
        p1.next = p2;
        if (next1 != null) {
            p2.next = next1;
        }
        p1 = next1;
        p2 = next2;
    }
    }
}