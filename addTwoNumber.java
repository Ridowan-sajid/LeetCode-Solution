 import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1="";
        String num2="";
        BigInteger sum;
        ListNode currentNode = l1;
        ListNode currentNode2 = l2;

        num1+=l1.val;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            num1+=currentNode.val;
        }

        num2+=l2.val;
        while (currentNode2.next != null) {
            currentNode2 = currentNode2.next;
            num2+=currentNode2.val;
        }
        String newNum1="";
        for(int i=num1.length()-1;i>=0;i--){
            newNum1+=num1.charAt(i);
        }

        String newNum2="";
        for(int i=num2.length()-1;i>=0;i--){
            newNum2+=num2.charAt(i);
        }
        BigInteger num1Number = new BigInteger(newNum1);
        BigInteger num2Number = new BigInteger(newNum2);
        sum=num1Number.add(num2Number);
        String sumVal=sum.toString();

        System.out.println(sum);
        ListNode head=null;
        ListNode current=null;

        for(int i=String.valueOf(sum).length()-1;i>=0;i--){
            ListNode newNode=new ListNode(Integer.parseInt(String.valueOf(sumVal.charAt(i))));

            if(head==null){
                head=newNode;
                current=newNode;
            }else{
                current.next=newNode;
                current=newNode;
            }
        }


        return head;
    }
}
