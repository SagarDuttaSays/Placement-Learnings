
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Swapping_Nodes_in_a_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        ListNode first = null, curr = head;
        k--;
        while(k>0){
            k--;
            curr = curr.next;
        }
        first = curr;
        curr = curr.next;
        ListNode second = head;
        while(curr!=null){
            second = second.next;
            curr = curr.next;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
            return head;
        }
    }