package LinkedList;
import java.util.*;


public class LL {
    Node head; /// before making a list we need to declare the head 
    int size; // size of the list
    LL(){
      size=0;
    }
    class Node{ /// creating the node inside which we can store the data, it is written in the form of a node
        String data; // data to be stored inside the 
        Node next; /// address of the next node
        Node(String data){
            this.data=data;
            this.next=null; /// intially that will point to null

        }

    }
    public void addFirst(String data){ // adding a node
        Node newNode= new Node(data); // creating a node
        if(head==null){ // if the head is null ie no linked list exists
            head= newNode;/// we are making the head as the newNode
            size++;
            return;
        }

         // if already a list exists and head is not null
         newNode.next= head; // if the newNode created has a list to be appended to
        head=newNode; // we create a new node we point the next towards the head ie the next node and head towards the newlt created node
        size++;
        
    }

    public void addLast(String data){ /// to add at the last of the node
        Node newNode= new Node(data);
            if(head==null){ // the intial condition will be same as before
                head = newNode; // if head is null that is no list present the head becomes newNode
                size++;
                return;
            }
            Node currentNode =head; //to traverse a linked we create a node and assign it to be the head
            while(currentNode.next!= null){ /// until the current node is not equals to null, we travel to the next node
                currentNode = currentNode.next; // the current node points towards the present node to the next node and so on
            } /// updating the current node, we will reach the last node when the current node's next becomes null
            size++;
            currentNode.next=newNode; /// when we reach the last node current node becomes the newNode
        
    }

    public void printList(){ /// printing the 
        if(head== null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            System.out.println(currentNode.data + "->");
            currentNode= currentNode.next;
        }
    }


    public static void main(String[] args) {
        LL newList = new LL();
         newList.addFirst("a");
         newList.addFirst("is");
         newList.printList();
         


          
        
    }
    
}
