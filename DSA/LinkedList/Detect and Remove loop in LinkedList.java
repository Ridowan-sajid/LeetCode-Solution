/*****************************************************
  
  Following is the structure of Node.
  public static class Node {
    
    int data;
    Node next;

    Node(int data) {
      this . data = data;
      this . next = null;
    }
  }

*****************************************************/

import java.util.ArrayList;

public class Solution {
  public static Node isCycleExist(Node head){
    if(head==null) return head;

    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast){
        return slow;
      }
    } 

    return null;
  }

  public static Node startingPoint(Node head){
    if(head==null) return head;

    Node slow=head;
    Node fast =isCycleExist(head);
    if(fast==null){
      return null;
    }
    while(slow!=fast){
      slow=slow.next;
      fast=fast.next;
    }
    return slow;
  }
  public static Node removeLoop(Node head) {
    Node c=startingPoint(head);
    Node slow=c;
    if(slow==null)return head;
    Node fast=slow.next;

    while(slow!=fast.next){
      fast=fast.next;
    }

    fast.next=null;
    return head;

  }
}
