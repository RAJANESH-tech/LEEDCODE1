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
    public ListNode removeElements(ListNode head, int val) {
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode c=d;
        while(c!=null && c.next!=null)
        {
            if(c.next.val==val)
            {
                ListNode t=c.next.next;
                c.next=t;
            }
            else
            {

                c=c.next;
            }
        }
        return d.next;
    }
}