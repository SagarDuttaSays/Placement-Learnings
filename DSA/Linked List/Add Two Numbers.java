
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
class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null || l2==null)
            return null;
        int sum = 0;
        int carry = 0;
        ListNode n = new ListNode(0);
        ListNode curr = n;
        while(l1!=null || l2!=null){
            if(l1==null)
                sum = (l2.val)+carry;
            else if(l2==null)
                sum = (l1.val)+carry;
            else 
                sum = (l1.val+l2.val)+carry;
            carry = sum/10;
            curr.next  = new ListNode(sum%10);
            curr = curr.next;
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
        }
        if(carry>0)
        curr.next  = new ListNode(carry);
        curr = curr.next;
        return n.next;
    }
}
