/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> l=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        // ArrayList<Integer> l=new ArrayList<>();   if i  initialize this here then i have to use l.addAll(inorderTraversal(root.left)); like this so that i initaialize global variable
        if(root == null) return l;
        inorderTraversal(root.left);
        l.add(root.val);
        inorderTraversal(root.right);
        return l;
    }
}