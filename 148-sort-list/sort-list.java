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
    public ListNode sortList(ListNode head) {
        return sort(head);
    }

    public ListNode sort(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode h1 = sort(head);
        ListNode h2 = sort(slow);
        ListNode ans = merge(h1, h2);
        return ans;

    }

    public ListNode merge(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (h1 != null && h2 != null) {
            if (h1.val <= h2.val) {
                tail.next = h1;
                h1 = h1.next;
            } else {
                tail.next = h2;
                h2 = h2.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes
        if (h1 != null)
            tail.next = h1;
        if (h2 != null)
            tail.next = h2;

        return dummy.next;

    }

}