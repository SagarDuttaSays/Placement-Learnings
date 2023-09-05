class Reverse_a_Linked_List_in_groups_of_given_size {
      public static Node reverse(Node node, int k)
    {
        if(node==null)
            return node;
        Node curr = node, prev = null;
        Node next = null;
        int idx = k;
        while(curr!=null && idx-->0){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node.next = reverse(next, k);
        return prev;
    }
}

/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/
