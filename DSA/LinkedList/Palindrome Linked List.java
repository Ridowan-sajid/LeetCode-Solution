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
    public ListNode midNode(ListNode head){
        ListNode small=head;
        ListNode fast=head.next;
        
        while(fast!=null && fast.next!=null){
            small=small.next;
            fast=fast.next.next;
        }

        return small;
    }

    public ListNode reverseNode(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;

        return head;
    }
    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null){
            return true;
        }

        ListNode midN=midNode(head);
        ListNode midNext=midN.next;

        ListNode head1=head;
        ListNode head2=reverseNode(midNext);

        while(head2!=null){
            if(head1.val!=head2.val){
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }

        return true;
    }
}
