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
    public ListNode reverseBetween(ListNode A, int B, int C) {
         ListNode temp=A;
        ListNode leftlink=null;
        ListNode end=null;
        int count=0;
        if(B==C)
            return A;
        while(temp!=null)
        {
            count++;
            if(count==B-1)
                leftlink=temp;
            if(count==C)
                end=temp;
            temp=temp.next;
        }
        ListNode start=null;
        if(B==1)
            start=A;
        else
            start=leftlink.next;
        ListNode rightlink=end.next;

        //Revrse Logic
        ListNode prev=rightlink;
        ListNode curr=start;
        ListNode currNext=rightlink;
        while(curr!=rightlink)
        {
            currNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currNext;
        }
        if(B==1)
            A=prev;
        else
            leftlink.next=prev;
    
        return A;
        
        
    }
}