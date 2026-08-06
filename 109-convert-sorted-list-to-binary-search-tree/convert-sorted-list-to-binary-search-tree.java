class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;    // base case 
        if(head.next==null) return new TreeNode(head.val);  // base case 

        ListNode mid=head;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            mid=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        TreeNode root=new TreeNode(slow.val);
        mid.next=null;
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(slow.next);

        return root;
    }
}