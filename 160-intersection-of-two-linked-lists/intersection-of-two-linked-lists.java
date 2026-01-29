/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;

    //  Finding the length of LL
        int lengthA=0;
        while(tempA!=null){
            lengthA++;
            tempA=tempA.next;
        }

        int lengthB=0;
        while(tempB!=null){
            lengthB++;
            tempB=tempB.next;
        }

    //  All temp at null so make it at head 
        tempA=headA;
        tempB=headB;
    //  increasing temp which has greater no. of node 
        if(lengthA>lengthB){
            int step=lengthA-lengthB;
            for(int i=0;i<step;i++){
                tempA=tempA.next;
            }
        }
        else{
            int step=lengthB-lengthA;
            for(int i=0;i<step;i++){
                tempB=tempB.next;
            }
        }

        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}