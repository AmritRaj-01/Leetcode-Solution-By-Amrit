import java.util.*;

class Solution {
    public void nthLevel(TreeNode root, int n, List<Integer> arr) {
        if (root != null) {
            if (n == 1) {
                arr.add(root.val);
                return;
            } else {
                nthLevel(root.left, n - 1, arr);
                nthLevel(root.right, n - 1, arr);
            }
        }
    }

    public void nthLevel1(TreeNode root, int n, List<Integer> arr) {
        if (root != null) {
            if (n == 1) {
                arr.add(root.val);
                return;
            } else {
                nthLevel1(root.right, n - 1, arr); 
                nthLevel1(root.left, n - 1, arr);  
            }
        }
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return root.left == null && root.right == null ? 0 : 1 + Math.max(height(root.left), height(root.right));
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        int level = height(root) + 1;
        for (int i = 1; i <= level; i++) {
            List<Integer> arr = new ArrayList<>();
            if (i % 2 != 0) {
                nthLevel(root, i, arr);  
            } else {
                nthLevel1(root, i, arr); 
            }
            ans.add(arr);
        }
        return ans;
    }
}