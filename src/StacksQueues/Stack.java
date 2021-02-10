package StacksQueues;

/*
Java Code for a Stack
Let’s examine a program, stack.java, that implements a stack using a class called
Stack. Listing 4.1 contains this class and a short main() routine to exercise it.
 */

public class Stack {

    private int maxSize;   // size of stack array
    private long[] stackArray;
    private int top;       // top of stack

    // constructor
    public Stack(int s){
        maxSize = s;                     // set array size
        stackArray = new long[maxSize];  //create array
        top = -1;                        // no items yet
    }

    //push item on top of stack
    public void push(long i){
        stackArray[++top] = i;  // increment top and insert item
    }

    // take item from top of stack
    public long pop(){
        return stackArray[top--];
    }

    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }

    // true if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }

    // true if stack is full
    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack theStack = new Stack(10); // make new stack
        theStack.push(20); // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        while( !theStack.isEmpty() ) // until it’s empty,
        { // delete item from stack
            long value = theStack.pop();
            System.out.print(value); // display it
            System.out.print(" ");
        } // end while
        System.out.println(" ");
    }
}
