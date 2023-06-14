
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
class Delete_the_Middle_Node_of_a_Linked_List {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)
            return null;
        int count = 0;
        ListNode curr = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        count = count/2 -1;
        ListNode slow = head, fast = head.next;
        while(count!=0){
            slow = slow.next;
            fast = fast.next;
            count--;
        }
        slow.next = fast.next;
        return head;
    }
}