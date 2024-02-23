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
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return head;
        }
        int size=0;
        ListNode sizePrev=null;
        ListNode sizeCurr=head;
        while(sizeCurr!=null){
            sizePrev=sizeCurr;
            sizeCurr=sizeCurr.next;
            size++;
        }
        ListNode prev=null;
        ListNode curr=head;
        int count=0;

        if(size<k){
            return head;
        }

        while(curr!=null && count<k && size>=k){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            count++;
        }

        if(curr!=null){
            head.next=reverseKGroup(curr,k);
        }

        return prev;
    }
}
