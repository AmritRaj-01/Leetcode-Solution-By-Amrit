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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode temp=reverse(slow.next);
        slow.next=null; // break linkedlist from slow

        ListNode first = head;
        while (temp != null) {    // merging two linkedlist
        ListNode tmp1 = first.next;
        ListNode tmp2 = temp.next;

        first.next = temp;
        temp.next = tmp1;

        first = tmp1;
        temp = tmp2;

    }
    }
}
