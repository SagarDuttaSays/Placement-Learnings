
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
class Reorder_List {
    public void reorderList(ListNode head) {
        //reach the mid node
        ListNode slow = head, fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow is at the exact mid node in case of odd length or at end node of first half in case of even length
        //reverse the second half
        ListNode rev = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(rev!=null){
            ListNode nextN = rev.next;
            rev.next = prev;
            prev = rev;
            rev= nextN;
        }
        //prev is pointing to the previously last node of the list (now it is the first node of second half)
        //alternatively add the nodes from the first and second halves
        ListNode first = head;
        ListNode second = prev;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}