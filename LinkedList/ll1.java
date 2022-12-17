package LinkedList;
import java.util.*;

public class ll1 {

        Node head;
        public void insert(int data){ // when we make a list it will just add data at the end


            Node n1 = new Node(); 
            n1.data= data;  // n1 node will be having a value which is 5
            n1.next=null;

            if(head==null){ // if this is the first node in the list? like if the head in null that means no nodes in the list

                head=node; // we assign the node with head
            }
            else{
                Node tempn = head; // tempn will be assigned to head and then iterate to check where there is null

                while(n.next!=null){
                   tempn= n.next; // this is checking if the node is not null

                }
               tempn.next= node;

            }




            
        }

        public void show(){
            Node node= head;
            while(node.next!=null){
                System.out.println(node.data); // we print it 
                node=node.next; // we shift
                

            }
        }
    }
    
