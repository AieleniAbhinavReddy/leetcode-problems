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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(slow.next==null) return;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
            if(fast!=null) fast=fast.next;
        }
        Stack<ListNode> stack=new Stack<>();
        ListNode curr=slow;
        while(curr!=null){
            stack.push(curr);
            curr=curr.next;
        }
        curr=head.next;
        ListNode temp=head;
        while(!stack.isEmpty()){
            temp.next=new ListNode(stack.pop().val);
            temp=temp.next;
            if(curr==slow) break;
            temp.next=new ListNode(curr.val);
            temp=temp.next;
            curr=curr.next;
        }
        head=temp.next;
    }   
}