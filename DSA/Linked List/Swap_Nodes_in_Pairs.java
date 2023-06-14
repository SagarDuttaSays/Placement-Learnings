
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
class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode prev = dummy;
        while(curr!=null && curr.next!=null){
            prev.next = curr.next;
            curr.next = prev.next.next;
            prev.next.next = curr;

            prev = curr;
            curr = curr.next;
        }  
        return dummy.next;
    }
}