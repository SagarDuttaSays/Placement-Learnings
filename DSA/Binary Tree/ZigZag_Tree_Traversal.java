/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/
class ZigZag_Tree_Traversal {
      //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    if(root==null)
	        return list;
	    Queue<Node> q = new LinkedList<>();
	    boolean rightToLeft = false;
	    q.add(root);
	    while(!q.isEmpty()){
	       ArrayList<Integer> temp = new ArrayList<Integer>();
	       int n = q.size();
	       for(int i = 0; i<n; i++){
	           Node curr = q.remove();
	           temp.add(curr.data);
	           if(curr.left!=null)
	            q.add(curr.left);
	           if(curr.right!=null)
	            q.add(curr.right);
	       }
	       if(rightToLeft)
	        Collections.reverse(temp);
	       rightToLeft = !rightToLeft;
	       list.addAll(temp);
	    }
	    return list;
	}
}
