package Array;

public class StackImplementation {
    public static void main(String[] args) {

Stack stack = new Stack(10);
    stack.push(2);
    System.out.println(stack.pop());
    stack.pop();

    }
}

class Stack{

    private int array[];
    private int top;
    private int capacity;

    Stack(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int item){

        if(isFull()){
            throw new RuntimeException("Stack is full") ;
        }
        array[++top] = item;
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }


    public int peek(){

        return array[top];
    }

    private boolean isFull() {
    return top == capacity - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

}