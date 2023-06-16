public class BST {
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode() {}
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public TreeNode insert(TreeNode root, int data){
        if(root==null){
            root = new TreeNode(data);
            return root;
        }
        if(root.data>data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }
    public void postOrderTraversal(TreeNode root){
        if(root==null)
            System.out.println();
        System.out.print(root.data+" ");
        if(root.left!=null)
            print(root.left);
        if(root.right!=null)
            print(root.right);
    }
    public void inOrderTraversal(TreeNode root){
        if(root==null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    public static void main(String args[]){
        int nodes[] = {5,1,3,4,2,7};
        BST bst = new BST();
        TreeNode root = null;
        for(int i: nodes){
            root = bst.insert(root, i);
        }
        bst.postOrderTraversal(root);
	//bst.inOrderTraversal(root);
    }
}