
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
class Range_Sum_of_BST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)
            return 0;
        int lsum = rangeSumBST(root.left, low, high);
        int hsum = rangeSumBST(root.right, low, high);
        int curr = 0;
        if(low<=root.val && root.val<=high)
            curr = root.val;
        return (lsum+hsum+curr);
    }
}