package Stackdatastructure;

public class DynamicStack extends StackImplementation {

    public DynamicStack() {
        super(); // this will call the default constructor of the superclass StackImplementation

    }

    public DynamicStack(int size) { // this will call the parameterized constructor of the the super class

    }

    public boolean push(int item) { // here we are overriding the push method of the parent class
        if (this.isFull()) { // this is a dynamic array so when the space gets filled
            int[] newarray = new int[array.length * 2]; // the size of the array increases twice

            for (int i = 0; i < array.length; i++) { // we are just pustting the value

                newarray[i] = array[i];
            }
            array = newarray;
        }
        return super.push(item); // if the array is not full then we are using the normal push method which is
                                 // present in the super class

    }

    public static void main(String[] args) throws Exception {
        DynamicStack dstack1 = new DynamicStack();
        dstack1.push(45); // here 45 is being pushed in first, it will definitely be the last one to get
                          // popped
        dstack1.push(29);
        dstack1.push(44);
        dstack1.push(57);
        dstack1.push(64);
        dstack1.push(55);
        dstack1.push(86);
        dstack1.push(64);
        dstack1.push(26);
        dstack1.push(783);
        dstack1.push(79);

        System.out.println(dstack1.pop());
        System.out.println(dstack1.pop());
        System.out.println(dstack1.pop());
        System.out.println(dstack1.pop());
        System.out.println(dstack1.pop());

    }

}
