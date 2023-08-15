class Reverse_Level_Order_Traversal {
      public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        if(node==null)
            return list;
        q.add(node);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr==null){
                if(q.isEmpty())
                    break;
                else
                    q.add(curr);
            } else {
                list.add(curr.data);
                if(curr.right!=null)
                    q.add(curr.right);
                if(curr.left!=null)
                    q.add(curr.left);
            }
        }
        Collections.reverse(list);
        return list;
    }
}      

/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
