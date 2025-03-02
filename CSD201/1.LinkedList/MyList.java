
public class MyList {

    Node head, tail;

    public MyList() {
        head = tail = null;
    }

    public boolean isEmty() {
        return head == null;
    }

    void addFirst(int value) {
        Node node = new Node(value);

        if (isEmty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    void addLast(int value) {
        Node node = new Node(value);
        if (isEmty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void addAtAnyPosition(int value, int position) {
        if (position > sizeOf() || position < 0) {
            System.out.println("Out of bound");
            return;
        }

        if (position == 0) {
            addFirst(value);
            return;
        }

        int index = 0;
        Node current = head;
        Node newNode = new Node(value);

        while (index < position - 1 && current != null) {
            current = current.next;
            index++;
        }
        newNode.next = current.next;
        current.next = newNode;

    }

    Node deleteLast() {
        if (isEmty() || sizeOf() == 1) {
            return null;
        }
        Node temp = tail;
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        tail = current;
        return temp;
    }

    Node deleteFirst() {
        Node temp = head;
        if (isEmty()) {
            return null;
        } else {
            head = head.next;
        }
        return temp;
    }

    Node deleteAtAnyPosition(int position) {
        if (position > sizeOf() || position < 0) {
            System.out.println("Out of bound");
            return null;
        }

        if (position == 0) {
            deleteFirst();
        }

        int index = 0;
        Node current = head;
        Node temp;

        while (index < position - 1 && current != null) {
            current = current.next;
            index++;
        }
        temp = current.next;
        current.next = current.next.next;
        return temp;
    }

    void reverseList() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    int sizeOf() {
        Node current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    Node get(int index) {
        Node current = head;
        int position = 0;
        while (current != null && position < index) {
            position++;
            current = current.next;
        }
        return current;
    }

    void sortList() {
        int n = sizeOf();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Node pi = get(i);
                Node pj = get(j);
                if (pi.value > pj.value) {
                    int t = pi.value;
                    pi.value = pj.value;
                    pj.value = t;
                }
            }
        }
    }

    void addAfter(int x, int position) {
        int index = 0;
        Node current = head;
        Node newNode = new Node(x);

        if (position >= this.sizeOf() || position < 0) {
            System.out.println("Out of bound!");
        }

        while (index < position && current != null) {
            current = current.next;
            index++;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    Node delAfter(int position) {
        int index = 0;
        Node current = head;
        
        if (position >= this.sizeOf() || position < 0) {
            System.out.println("Out of bound!");
        }
        while (index < position && current != null) {
            current = current.next;
            index++;
        }
        Node newNode = current.next;
        current.next = current.next.next;
        return newNode;
    }
    
    void delNodeByValue(int x) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == x) {
                deleteAtAnyPosition(index);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Node not exited!");
    }
    
    int[] toArray(){
        
        int[] x = new int[this.sizeOf()];
        Node current = head;
        int index = 0;
        while(current != null) {
            x[index] = current.value;
            current = current.next;
            index++;
        }
        return x;
    }
            
    void traversal() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
