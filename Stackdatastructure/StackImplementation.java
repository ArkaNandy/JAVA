package Stackdatastructure;

public class StackImplementation {
  protected int[] array; //a protected array
  private static final int DEFAULT_SIZE=10; // of size 10
  int pointer=-1; //initially the pointer is se to -1 when there are no elements in the array

  public StackImplementation(){ // if no size is passed it will call this method
    this(DEFAULT_SIZE); // if no size is passed wewill be assigning the default value only which has been declared 
     

  }

    public StackImplementation(int size){ // if a size is passed it will use this method
        this.array= new int[size];

    }

    public boolean push(int item){ // when an item is being passed to be pushed inside the stack

        if(isFull()){
            System.out.println("Stack is full");
            
        }
        else
        isEmpty();

        pointer++; // when an element is inseted pointer is incremented
        array[pointer]= item ; // and we place the item in the position of the item
        return true;
    }


    public int pop() throws Exception{ 

        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }

        
        return array[pointer--];

    }

    public int peek() throws Exception{ // peek gets the first
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return array[pointer];
        
        

    }






    public  boolean isFull() {
        return pointer== array.length-1; // pointer is at last index no more elemnts can be inserted
    }

    public boolean isEmpty(){
        return pointer== -1; // means the array is empty
    }

    public static void main(String[] args) throws Exception {
        StackImplementation stack1 = new StackImplementation();
        stack1.push(45); // here 45 is being pushed in first, it will definitely be the last one to get popped
        stack1.push(29);
        stack1.push(44);
        stack1.push(57);
        stack1.push(64);
        System.out.println(stack1.pop()); 
        System.out.println(stack1.pop());
       System.out.println(stack1.pop());
       System.out.println(stack1.pop());

       System.out.println(stack1.peek());
       System.out.println(stack1.peek());
       System.out.println(stack1.peek());


       System.out.println(stack1.peek());

       

        
    
    }

  
    
}

