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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reverseL1=l1;
        ListNode reverseL2=l2;
        ListNode finalOne=new ListNode();
        ListNode temp=finalOne;
        int carry=0;
        
        while(reverseL1!=null && reverseL2!=null){
            int total=reverseL1.val+reverseL2.val+carry;
            carry=0;
            if(total>9){
                carry=total/10;
                total=total%10;
            }
            ListNode newOne=new ListNode(total);
            //temp.val=total;
            temp.next=newOne;
            temp=temp.next;
            reverseL1=reverseL1.next;
            reverseL2=reverseL2.next;
            //finalOne=finalOne.next;
        }

        while(reverseL1!=null){
            int total=reverseL1.val+carry;
            carry=0;
            if(total>9){
                carry=total/10;
                total=total%10;
            }
            ListNode newOne=new ListNode(total);
            //temp.val=total;
            temp.next=newOne;
            temp=temp.next;
            reverseL1=reverseL1.next;
        }

        while(reverseL2!=null){
            int total=reverseL2.val+carry;
            carry=0;
            if(total>9){
                carry=total/10;
                total=total%10;
            }
            ListNode newOne=new ListNode(total);
            //temp.val=total;
            temp.next=newOne;
            temp=temp.next;
            reverseL2=reverseL2.next;
        }

        if(carry>0){
            ListNode newOne=new ListNode(carry);
            //temp.val=total;
            temp.next=newOne;
            temp=temp.next;
        }
        return finalOne.next;
    }
}
