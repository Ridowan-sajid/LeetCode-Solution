class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }

    public static void printLinkedList(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static int getLength(Node head){
        Node temp=head;
        int length=0;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    public static Node insertAtHead(Node head, int data){
        Node newOne=new Node(data);
        newOne.next=head;
        head.prev=newOne;
        head=newOne;
        return head;
    }

    public static Node insertAtTail(Node tail, int data){
        Node newOne=new Node(data);
        newOne.prev=tail;
        tail.next=newOne;
        tail=newOne;
        return tail;
    }

    public static Node insertAtPosition(Node head,Node tail,int position, int d){
        Node temp=head;
        Node newOne=new Node(d);

        if(position==0){
            return insertAtHead(head,d);
        }

        int count=0;
        while(count<position-1){
            temp=temp.next;
            count++;
        }

        if(temp.next==null){
            insertAtTail(tail,d);
            return head;
        }

        newOne.next=temp.next;
        newOne.prev=temp;
        temp.next=newOne;
        temp.next.prev=newOne;

        return head;
    }


    public static Node deleteNode(int position, Node head){
        if(position==0){
            Node temp=head;
            head=head.next;
            temp.next.prev=null; //breaking the line of previous
            temp.next=null; //braking the line of next
            temp=null;
            return head;
        }else{
            Node curr=head;
            Node prev=null;
            int count=0;
            while(count<position-1){
                prev=curr;
                curr=curr.next;
                count++;
            }

            prev.next=curr.next;
            curr.next.prev=prev;
            curr.next=null;
            curr.prev=null;
            curr=null;    //since we don't need current one we make it null. rest of the thing will be taken care by java

            return head;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Node head=new Node(5);
        Node n2=new Node(6);

        head.next=n2;

        head=Node.insertAtHead(head,4);
        Node n4=Node.insertAtTail(n2,7);
        head=Node.insertAtPosition(head,n4,2,8);
        head=Node.deleteNode(2,head);
        Node.printLinkedList(head);
        //System.out.println(Node.getLength(n1));
    }
}
