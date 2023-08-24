/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Lowest_Common_Ancestor_of_a_Binary_Tree {
      public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p==null || q==null || root==p || root==q)
            return root;
            
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left!=null && right==null)
            return left;
        else if(right!=null && left==null)
            return right;
        else if (left!=null && right!=null)
            return root;
        else return null;
    }
}
