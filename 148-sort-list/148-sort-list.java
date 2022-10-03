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
    public ListNode merge(ListNode h1,ListNode h2)
    {
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;
        while(h1!=null && h2!=null)
        {
            if(h1.val<=h2.val)
            {
                temp.next=h1;
                h1=h1.next;
            }
            else
            {
                temp.next=h2;
                h2=h2.next;
            }
            temp=temp.next;
        }
        if(h1!=null)
            temp.next=h1;
        if(h2!=null)
            temp.next=h2;
        return ans.next;
        
    }
    public ListNode mergeSort(ListNode head)
    {
        if(head==null || head.next==null)
                return head;
        ListNode mid=middle(head);
        ListNode midNext=mid.next;
        mid.next=null;
        ListNode left=mergeSort(head);
        ListNode right=mergeSort(midNext);
        return merge(left,right);
    }
    
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
        
    }
}