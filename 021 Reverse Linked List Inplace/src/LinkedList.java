import java.util.LinkedHashMap;

public class LinkedList {
    private Node head;
    private Node tail;

    LinkedList() {
        head = null;
        tail = null;
    }

    public void addElement(int value) {
        Node newElement = new Node(value);

        if (head == null) {
            head = newElement;
            tail = newElement;
        } else {
            tail.next = newElement;
            tail = newElement;
        }
    }

    public void printElements() {
        Node iterator = head;

        while (iterator != null) {
            System.out.print(iterator.value + " ");
            iterator = iterator.next;
        }
        System.out.println();
    }

    public void reverse()
    {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;

            previous = current;
            current = next;
        }

        Node copy = head;
        head = tail;
        tail = copy;
    }
}
