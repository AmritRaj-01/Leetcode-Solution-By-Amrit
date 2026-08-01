class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root.left, root.right, 1);
        return root;
    }
    private void dfs(TreeNode l, TreeNode r, int level) {
        if (l == null || r == null) return;
        if (level % 2 == 1) {
            int temp = l.val;
            l.val = r.val;
            r.val = temp;
        }
        dfs(l.left, r.right, level + 1);
        dfs(l.right, r.left, level + 1);
    }
}