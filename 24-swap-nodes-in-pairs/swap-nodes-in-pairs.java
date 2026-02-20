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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);   // create dummy List 
        dummy.next=head;
        ListNode point= dummy;    

        if(head==null) return null;
        if(head.next==null) return head;

        while(point.next!=null && point.next.next!=null){   
            ListNode swap1=point.next;  //head.next
            ListNode swap2=point.next.next;    // head.next.next

            swap1.next=swap2.next;  
            swap2.next=swap1;

            point.next=swap2;
            point=swap1;   // move to next pointer
        }
        return dummy.next;
    }
}