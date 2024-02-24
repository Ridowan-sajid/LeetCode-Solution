/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class Solution {
    public static Node uniqueSortedList(Node head) {
        if(head==null) return null;
        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            if(prev.data==curr.data){
                prev.next=curr.next;
                curr=curr.next;
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}
