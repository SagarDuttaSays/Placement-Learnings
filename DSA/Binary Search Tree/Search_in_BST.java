class Search_in_BST { 
     public static boolean searchInBST(BinaryTreeNode root, int x) { 
        // Write your code here.
        if(root==null)
            return false;
        if(root.data==x)    
            return true;
        if(x<root.data)
           return searchInBST(root.left, x);
        else if(x>root.data)   
           return searchInBST(root.right,x);
        return false;
    }
} 
/*********************************************************

 Following is the BinaryTreeNode structure:

 class BinaryTreeNode {
     int data;
     BinaryTreeNode left;
     BinaryTreeNode right;
     BinaryTreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     BinaryTreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/
