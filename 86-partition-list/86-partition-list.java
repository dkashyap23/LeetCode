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
    public ListNode partition(ListNode A, int B) {
        ListNode less=new ListNode(-1);
        ListNode eq_greater=new ListNode(-1);
        ListNode eq_head=eq_greater;
        ListNode less_head=less;
        ListNode ans=less;
        ListNode temp=A;
        while(temp!=null)
        {
            if(temp.val<B)
            {
                less.next=temp;
                temp=temp.next;
                less=less.next;
            }
            else
            {
                eq_greater.next=temp;
                temp=temp.next;
                eq_greater=eq_greater.next;
            }
        }
        less.next=null;
        eq_greater.next=null;
        if(less_head.next==null)
            return eq_head.next;
        if(eq_head.next==null)
            return less_head.next;
        less.next=eq_head.next;
        return ans.next;
        
    }
}