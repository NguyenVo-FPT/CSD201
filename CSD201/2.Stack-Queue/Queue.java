
import java.util.EmptyStackException;


public class Queue {

    private Node front;
    private int length;

    public Queue() {
        this.front = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        Node current = this.front;
        if (isEmpty()) {
            this.front = newNode;
            length++;
            return;
        }        
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public Node dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        
        
        Node temp = front;
        front = front.next;
        temp.next = null;
        length--;
        
        return temp;
    }

    public Node peak() {
        return front;
    }

    public void traversal() {
        Node current = front;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
