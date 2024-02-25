/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution
{
    public static Node sortList(Node head) {
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;

        Node temp=head;
        while(temp!=null){
            if(temp.data==0) zeroCount++;
            if(temp.data==1) oneCount++;
            if(temp.data==2) twoCount++;

            temp=temp.next;
        }

        temp=head;
        while(temp!=null){
            if(zeroCount!=0){
                temp.data=0;
                zeroCount--;
            }else if(oneCount!=0){
                temp.data=1;
                oneCount--;
            }else if(twoCount!=0){
                temp.data=2;
                twoCount--;
            }
            temp=temp.next;
        }

        return head;
    }
}
