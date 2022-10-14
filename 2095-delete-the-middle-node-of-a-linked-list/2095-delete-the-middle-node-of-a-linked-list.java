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
    public ListNode middle(ListNode head)
    {
        ListNode slow=head;
        ListNode ans=null;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            ans=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return ans;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
                return null;
        ListNode middle_prev=middle(head);
        if(middle_prev.next.next==null)
                middle_prev.next=null;
        else
          middle_prev.next=middle_prev.next.next;
        return head;
        
        
    }
}