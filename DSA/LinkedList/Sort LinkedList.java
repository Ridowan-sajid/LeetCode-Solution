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
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public ListNode mergeNode(ListNode left, ListNode right){
        ListNode finalNode=new ListNode(-1);
        ListNode temp=finalNode;
        while(left!=null && right!=null){
            if(left.val>right.val){
                finalNode.next=right;
                finalNode=finalNode.next;
                right=right.next;
            }else{
                finalNode.next=left;
                finalNode=finalNode.next;
                left=left.next;
            }
        }
        while(left!=null){
            finalNode.next=left;
            finalNode=finalNode.next;
            left=left.next;
        }

        while(right!=null){
            finalNode.next=right;
            finalNode=finalNode.next;
            right=right.next;
        }
        return temp.next;
        
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode leftNode=head;
        ListNode midNode=mid(head);
        ListNode rightNode=midNode.next;
        midNode.next=null;

        leftNode=sortList(leftNode);
        rightNode=sortList(rightNode);

        ListNode res=mergeNode(leftNode,rightNode);
        return res;
    }
}
