
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
class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
            return null;
        int count = 0;
        ListNode curr = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        if(count==n)
            return head.next;
        count = count-n-1;
        ListNode slow = head, fast = head.next;
        while(count>0){
            slow = slow.next;
            fast = fast.next;
            count--;
        }
        slow.next = fast.next;
        return head;
    }
}