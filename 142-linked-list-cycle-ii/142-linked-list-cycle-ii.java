/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int flag=1;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            return null;
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
        
    }
}