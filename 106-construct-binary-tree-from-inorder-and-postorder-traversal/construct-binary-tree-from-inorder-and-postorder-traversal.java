
class Solution {
    public TreeNode helper(int []inorder,int inlow,int inhigh,int[] postorder,int postlow,int posthigh){
        if(postlow>posthigh) return null;
        TreeNode root=new TreeNode(postorder[posthigh]);
        int i=inlow;
        while(inorder[i]!=postorder[posthigh]) i++;
        int leftSize = i-inlow;
        root.left=helper(inorder,inlow,i-1,postorder,postlow,postlow+leftSize-1);
        root.right=helper(inorder,i+1,inhigh,postorder,postlow+leftSize,posthigh-1);
        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n =postorder.length;
        return helper(inorder,0,n-1,postorder,0,n-1);
    }
}