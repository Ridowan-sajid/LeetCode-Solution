class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }

    public static Node insertNode(Node tail,int element, int data){
        if(tail==null){
            Node newNode=new Node(data);
            tail=newNode;
            newNode.next=newNode;
        }else {
            Node curr=tail;

            while (curr.data!=element){
                curr=curr.next;
            }

            Node newNode=new Node(data);
            newNode.next=curr.next;
            curr.next=newNode;

        }

        return tail;
    }

    public static Node deleteNode(Node tail, int data){
        if(tail==null){
            System.out.println("List is empty");
            return null;
        }
        Node prev=tail;
        Node curr=tail.next;

        while(curr.data!=data){
            prev=curr;
            curr=curr.next;
        }

        //if there is only one value; prev, current, all are same
        if(curr==prev){
            tail=null;
        }

        //if our desire deleted value is tail then we need to changed the tail.
        //then it will not be in while loop because first value is tail.
        if(tail==curr){
            tail=prev;
        }

        prev.next=curr.next;
        curr.next=null;
        curr=null;

        return tail;

    }

    public static void printLinkedList(Node tail){
        Node temp=tail;
        System.out.println(tail.data);
        while (tail.next!=temp){
            tail=tail.next;
            System.out.println(tail.data);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Node n1=new Node(5);
        Node n2=new Node(10);
        Node n3=new Node(15);
        n1.next=n2;
        n2.next=n3;
        n3.next=n1;

        Node.insertNode(n3,10,6);
        Node tail=Node.deleteNode(n3,10);
        Node.printLinkedList(tail);
    }
}
