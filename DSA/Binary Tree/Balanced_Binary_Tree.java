
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
class Balanced_Binary_Tree {
    public int ht(TreeNode root){
        if(root==null)
            return 0;
        int lht = ht(root.left);
        int rht = ht(root.right);
        return Math.max(lht, rht)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int left = ht(root.left);
        int right = ht(root.right);

        if(Math.abs(left-right)>1)
            return false;
        
        boolean leftFlag = isBalanced(root.left);
        boolean rightFlag = isBalanced(root.right);

        if(leftFlag && rightFlag)
            return true;
        else
            return false;
    }
}