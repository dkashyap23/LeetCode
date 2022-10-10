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
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        //ListNode temp=head;
        ListNode head1=head;
        ListNode mid=middle(head);
        ListNode midnext=mid.next;
        mid.next=null;
        ListNode head2=reverse(midnext);
        // while(head2!=null)
        // {
        //     System.out.print(head2.val+" ");
        //     head2=head2.next;
        // }
        //System.out.println(head2.val);
        while(head2!=null)
        {
            ListNode t1=head2.next;
            head2.next=head1.next;
            head1.next=head2;
            head2=t1;
            head1=head1.next.next;
        }
        //return ans;
    }
}