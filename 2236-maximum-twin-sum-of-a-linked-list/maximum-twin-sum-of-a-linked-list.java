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
    public int pairSum(ListNode head) {
        int len=0,sum=0;
        Stack<ListNode> stack=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        curr=head;
        for(int i=0;i<len/2;i++){
            stack.push(curr);
            curr=curr.next;
        }
        while(!stack.isEmpty() && curr!=null){
            sum=Math.max(sum,stack.pop().val+curr.val);
            curr=curr.next;
        }
        return sum;
    }
}