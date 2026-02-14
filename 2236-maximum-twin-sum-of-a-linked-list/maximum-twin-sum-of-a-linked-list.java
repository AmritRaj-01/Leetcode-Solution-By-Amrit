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
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        } 
        ListNode temp = reverse(slow);
        int max = Integer.MIN_VALUE;
        ListNode p1 = head, p2 = temp;
        while (p2 != null) {
            int sum = p1.val + p2.val;
            max = Math.max(max, sum);
            p1 = p1.next;
            p2 = p2.next;
        }

        return max;

    }
}