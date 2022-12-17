package Linkedlist2;








public class Linkedlist { // this class needs to have certain methods cause we are implementing on our own
    Class Node{
    }



    

    

    Node head; // declaring the head

    public void insert(int data){ // the insertion we want to perform, everytime we insert we are creating a new node
        Node n1= new Node();
        n1.data= data; // this is the data what the user passes, if the user passes 5 the nide will get a value 5
        node.next=null;


        if(head==null){ // if head is null
            head=node; // the first node becomes the head of the linked list

        }
        else{ //what if there already is a head?
            Node n= head;
            while(n.next!=null){
                n=n.next;

            }
            n.next=node;

        }
        

    }
}

    public void show(){ // to print the linked list
        Node node=head; // we start with the head
        while(node.next!=null){ // we traverse the list till it's not null
            System.out.println(node.data); //we print the value
            node=node.next; // we shift to the next node
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert
        list.show();



    }


    
}

