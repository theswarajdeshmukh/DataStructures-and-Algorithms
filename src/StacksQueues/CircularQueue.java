package StacksQueues;

/*
    34, 45, 46, 57, 68, 69, 33, 88
    0   1   2   3   4   5   6    7
        R   F

        (rear + 1) % size = front
 */


public class CircularQueue {

    static class Queue{
        int front, rear;
        int[] queueArray;

        public Queue(int size){
            queueArray = new int[size + 1];   // (size + 1) so that front of the queue always remain empty
            front = 0;
            rear = 0;
        }
    }

    public void enqueue(int data){

    }

}
