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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) return head;

        int size=1;   // finding the length of list
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            size++;
        }
        
        k=k%size;   // agar size length se bada ho phir iss se length chota ho jayega 
        if(k==0) return head;

        ListNode curr=head;     // jitna size hoga uss se 1 kam tak ruk jayega 
        for(int i=0;i<size-k-1;i++){
            curr=curr.next;
        }

        ListNode newhead=curr.next; 
        curr.next=null;
        tail.next=head;
         
        return newhead;
    }
}