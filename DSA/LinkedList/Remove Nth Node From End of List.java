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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode r=reverse(head);
        int count=1;

        ListNode prevVal=null;
        ListNode temp=r;
        while(temp!=null){
            if(count==n){
                break;
            }
            prevVal=temp;
            temp=temp.next;
            count++;
        }
        if(prevVal!=null && temp!=null){
            prevVal.next=temp.next;
        }
        if(count==1){
            r=r.next;
        }
        r=reverse(r);
        return r;
    }
}
