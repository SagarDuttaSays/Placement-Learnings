
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
class Kth_Smallest_Element_in_a_BST {
    public int kthSmallest(TreeNode root, int k) {
        if(root==null || (root.left==null && root.right==null))
            return root.val;
        Queue<TreeNode> q = new LinkedList<>();
        Set<Integer> set = new LinkedHashSet<>();
        q.add(root);
        q.add(null);
        set.add(root.val);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                if(!q.isEmpty())
                    q.add(null);
                else break;
            }
            else {
                set.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for(int i = 0; i<k; i++){
            if(i==k-1)
                return list.get(i);
        }
        return -1;
        }
    }