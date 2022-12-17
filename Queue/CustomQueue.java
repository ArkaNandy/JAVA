package Queue;

public class CustomQueue {

    private int[] array;
    private static final int DEFAULT_SIZE = 10;
    int endpointer = 0; // in queue we can insert from the last as well

    public CustomQueue() { /// if the user doesn't pass any size value then it will be of the default size
                           /// 10;
        this(DEFAULT_SIZE);

    }

    public CustomQueue(int size) { // if the user passes any size value
        this.array = new int[size];
    }

    // Time= O(1)
    public boolean isFull() {
        return endpointer == array.length; // ponter is at the last index no more space left to insert
    }

    //Time=O(1)
    public boolean isEmpty() {
        return endpointer == 0;// is it's empty
    }
 
    // Time= O(1)
    public boolean insert(int item) {
        if (isFull()) {
            return false; // while inserting if it's full return false

        }
        array[endpointer] = item; // if not full put the item in the array
        endpointer++; // pointer increments
        return true; // adn we return true ie the elemnt has been inserted
    }

    // Time O(size of queue))

    public int remove() throws Exception { // method to remove from the stack
        if (isEmpty()) {
            throw new Exception("Queue is empty"); // if the queue is empty
        }

        int removed = array[0]; // from the first position its's getting removed
        for (int i = 1; i < endpointer; i++) {
            array[i - 1] = array[i]; 

        }
        endpointer--;

        return removed;

    }
// Time O(1)
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");

        }
        return array[0];

    }
// Time O(size of queue)
    public void display() {
        for (int i = 0; i < endpointer; i++) {
            System.out.println(array[i]);

        }
    }

}

class Runner {
    public static void main(String[] args) throws Exception {
        CustomQueue cq1 = new CustomQueue();

        cq1.insert(5);
        cq1.insert(9);
        cq1.insert(7);        System.out.println(cq1.remove());

        cq1.insert(6);
        cq1.insert(2);
        cq1.insert(1);



        
        System.out.println(cq1.remove());
        System.out.println(cq1.remove());
        cq1.display();



    }
}