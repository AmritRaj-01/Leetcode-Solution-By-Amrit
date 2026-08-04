class Solution {
    public TreeNode helper(int []preorder,int prel,int preh,int[] postorder,int postl,int posth){
        if(postl>posth) return null;
        TreeNode root=new TreeNode (preorder[prel]);
        if (prel == preh) return root;
        int leftRoot = preorder[prel + 1];
        int idx = postl;
        while(postorder[idx] != leftRoot) idx++;
        int leftSize = idx - postl + 1;
        root.left = helper(preorder,prel + 1,prel + leftSize,postorder,postl,idx);
        root.right = helper(preorder,prel + leftSize + 1,preh,postorder,idx + 1,posth - 1);

        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n=preorder.length;
        return helper(preorder,0,n-1,postorder,0,n-1);
    }
}