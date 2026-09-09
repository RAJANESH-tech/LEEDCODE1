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
    public boolean isPalindrome(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        ListNode c=s;
        ListNode prev=null;
        while(c!=null)
        {
            ListNode n=c.next;
            c.next=prev;
            prev=c;
            c=n;
        }
        ListNode l=head;
        ListNode r=prev;
        while(r!=null)
        {
            if(l.val!=r.val)
            {
                return false;
            }
            l=l.next;
            r=r.next;
        }
        return true;

    }
}