import java.util.* ;
import java.io.*; 

/************************************************************

    Following is the linked list node structure
    
    class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

************************************************************/


public class Solution {
	
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if(head==null)return head;
        Map<Integer,Boolean> visited=new HashMap<>();
        LinkedListNode<Integer> temp=head;
        visited.put(temp.data,true);
        while(temp!=null && temp.next!=null){
            if(visited.containsKey(temp.next.data) && visited.get(temp.next.data)==true){
                temp.next=temp.next.next;
            }else{
                visited.put(temp.next.data,true);
                temp=temp.next;
            }
        }
        return head;
	}

}
