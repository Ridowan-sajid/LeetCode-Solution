/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node copyNode=new Node(-1);
        Node t=copyNode;
        Node temp=head;
        Map<Node,Node> store=new HashMap<>();
        while(temp!=null){
            Node newNode =new Node(temp.val);
            copyNode.next=newNode;
            copyNode=copyNode.next;
            temp=temp.next;
        }

        temp=head;
        Node tempOne=t.next;
        while(temp!=null){
            store.put(temp,tempOne);
            temp=temp.next;
            tempOne=tempOne.next;
        }

        temp=t.next;
        Node mainOne=head;
        while(temp!=null){
            if(store.get(mainOne)!=null){
                temp.random=store.get(mainOne.random);
            }
            temp=temp.next;
            mainOne=mainOne.next;
        }

        return t.next;
    }
}
