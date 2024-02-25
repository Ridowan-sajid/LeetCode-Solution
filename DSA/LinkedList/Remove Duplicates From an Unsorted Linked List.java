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
        LinkedListNode<Integer> temp1=head;
        while(temp1!=null){
            LinkedListNode<Integer> prev=temp1;
            LinkedListNode<Integer> temp2=temp1.next;
            while(temp2!=null){
                if(temp1.data==temp2.data){
                    prev.next=temp2.next;
                    temp2=temp2.next;
                }else{
                    prev=temp2;
                    temp2=temp2.next;
                }
            }
            temp1=temp1.next;
        }
        return head;
        
	}

}
