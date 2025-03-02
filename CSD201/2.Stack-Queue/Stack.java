
public class Stack {

    private Node top;
    private int length;

    public Stack() {
        this.top = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        length++;
    }

    public Node pop() {
        Node newNode = top;
        top = top.next;

        return newNode;
    }
    
    public Node peak() {
        return top;
    }
    
    public void clear() {
        while (!isEmpty()) {
            pop();
        }
    }
    
    public void traversal() {
        Node current = top;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;  // Update the current node
        }
        System.out.println("null");
    }
}
