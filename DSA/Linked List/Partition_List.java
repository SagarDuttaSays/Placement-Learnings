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
class Partition_List {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)
            return head;
        //1 4 3 2 5 2
        ListNode lessThanX = null, curr = head, xOrMore = null;
        ListNode lessHead = null, xHead = null;
        while(curr!=null){
            if(curr.val<x){
                if(lessThanX==null){
                    lessThanX = curr;
                    lessHead = lessThanX;
                }
                else {
                    lessThanX.next = curr;
                    lessThanX = lessThanX.next;
                }
            }
            else {
                if(xOrMore==null){
                    xOrMore = curr;
                    xHead = xOrMore;
                }
                else {
                    xOrMore.next = curr;
                    xOrMore = xOrMore.next;
                }
            }
            curr = curr.next;
        }
        if(xOrMore!=null) xOrMore.next = null;
        if(lessThanX!=null) lessThanX.next = xHead;
        return (lessHead!=null) ? lessHead : xHead;
    }
    
}