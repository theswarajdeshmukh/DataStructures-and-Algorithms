package LinkedLists;

/*
Doubly Linked List
 */
public class DoublyLinkedList {

    Node head;
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int d){
            data = d;
        }
    }

    public void push(int new_data){

        Node new_node = new Node(new_data);

        new_node.next = head;
        new_node.prev = null;

        if (head != null){
            head.prev = new_node;
        }

        head = new_node;

    }

    public void insertAfter(Node prev_Node, int new_data){

        if (prev_Node == null){
            System.out.println("Prev node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);

        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;

        if (new_node.next != null){
            new_node.next.prev = new_node; //new node's next should point towards previous as it is doubly linked list
        }
    }

    public void addEnd(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = null;

        if (head == null){
            new_node.prev = null;
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = new_node; // insert our new node
        new_node.prev =last;
    }

    public void printList(Node node){
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public void deleteNode(Node head_ref,Node key){

        if (head == null || key == null){
            return;
        }

        // case 1
        if (head == key){
            head = key.next;
        }

        // case 2
        if (key.next != null){
            key.next.prev = key.prev;
        }

        if (key.prev != null){
            key.prev.next = key.next;
        }

        return;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.push(2);
        list.printList(list.head);

    }


}
