
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
class Symmetric_Tree {
    public static boolean isMirror(TreeNode rootL, TreeNode rootR){
        if(rootL==null && rootR==null)
            return true;
        if(rootL==null || rootR==null)
            return false;
        return rootL.val==rootR.val && isMirror(rootL.left, rootR.right) && isMirror(rootL.right, rootR.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isMirror(root.left, root.right);
    }
}