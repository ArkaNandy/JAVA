package LinkedList;
import java.util.*;
import java.io.*;


public class linkedlist2 {
    Node head;
    class node{ // node creation
        int data;
        Node next;
        node(int data){
            this.data=data;
        }
    }

    public static insertionofNode(linkedlist2 ,int data){
        Node n1= new Node(data);
        n1.next= null; // assigning it empty

        if(list.head==null){ // if the list is empty head will be null
            list.head = n1; // we define n1 as the head list
        }
        else{
            Node current = list.head;

            while(current!=null){
                current = current.next;

            }

            return list;
        }
    }

        public static void printList(LinkedList list){

            Node curr = list.head; //defining the temporary current node at head
            System.out.println("LinkedList:");
            while(curr!= null){
                System.out.println(curr.data+" ");
                curr= curr.next;
            }

        }


    


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        
    }
    
}
