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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fakehead=new ListNode(0);
        fakehead.next=head;
        ListNode pre=fakehead;
        ListNode curr=head;
        while(curr!=null)
        {
            while(curr.next!=null && curr.val==curr.next.val)
            {
                curr=curr.next;
            }
            if(pre.next==curr)
            {
                pre=pre.next;
            }
            else
                pre.next=curr.next;
            curr=curr.next;
        }
        return fakehead.next;
    }
}