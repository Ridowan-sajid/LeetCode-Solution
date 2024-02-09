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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firstTemp=list1;
        ListNode secondTemp=list2;
        ListNode finalNode=new ListNode();
        ListNode temp=finalNode;

        while(firstTemp!=null && secondTemp!=null){
            if(firstTemp.val<secondTemp.val){
                finalNode.next=firstTemp;
                firstTemp=firstTemp.next;
            }else{
                finalNode.next=secondTemp;
                secondTemp=secondTemp.next;
            }
            finalNode=finalNode.next;
        }

        while(firstTemp!=null){
            finalNode.next=firstTemp;
            firstTemp=firstTemp.next;
            finalNode=finalNode.next;
        }

        while(secondTemp!=null){
            finalNode.next=secondTemp;
            secondTemp=secondTemp.next;
            finalNode=finalNode.next;
        }

        return temp.next;
    }
}
