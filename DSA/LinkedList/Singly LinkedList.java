class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }

    public static Node insertAtHead(Node head, int d){
        Node temp=new Node(d);
        temp.next=head;
        head=temp;

        return head;
    }

    public static Node insertAtTail(Node tail, int d){
        Node temp=new Node(d);
        tail.next=temp;
        tail=temp;

        return tail;
    }

    public static void insertAtPosition(Node head,Node tail,int position, int d){
        //If position is 0.
        if(position==0){
            insertAtHead(head,d);
            return;
        }

        Node temp = head;

        //if position is last.
        if(temp.next==null){
            insertAtTail(tail,d);
            return;
        }

        int count=0;
        while(count<position-1){
            temp=temp.next;
            count++;
        }

        Node newOne=new Node(d);

        newOne.next=temp.next;
        temp.next=newOne;

        //return head;
    }

    public static Node deleteNode(int position, Node head){
        if(position==0){
            Node temp=head;
            head=head.next;
            temp.next=null;
            return head;
        }else{
            Node curr=head;
            Node prev=null;
            int count=0;
            while(count<=position-1){
                prev=curr;
                curr=curr.next;
                count++;
            }

            prev.next=curr.next;
            curr.next=null; //deleting the next line.
            curr=null;     //since we don't need current one we make it null. rest of the thing will be taken care by java

            return head;
        }
    }

    public static void printLinkedList(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Node n1=new Node(20);
        Node tail1=Node.insertAtTail(n1,25);
        Node tail2=Node.insertAtTail(tail1,30);

        Node n2=Node.insertAtHead(n1,10);
        Node n3=Node.insertAtHead(n2,5);
        Node.insertAtPosition(n3,tail2,5,35);

        n3=Node.deleteNode(2,n3);
        Node.printLinkedList(n3);
    }
}
