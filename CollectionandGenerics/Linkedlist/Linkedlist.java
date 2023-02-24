package CollectionandGenerics.Linkedlist;

public class Linkedlist {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }

    public void printLinkedlist() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;

        }

    }

    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();

        Node first = l1.new Node(10); // we are passing the value of the first node as 10
        l1.head = first; /// the head is pointing to the first nod

        Node second = l1.new Node(20);// we create the next node
        first.next = second;// after creating the second node we need to connect it to the first node

        Node third = l1.new Node(30);
        second.next = third;
        third.next = null;

        l1.printLinkedlist();

    }

}
