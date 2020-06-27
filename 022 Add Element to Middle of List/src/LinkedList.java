public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList() {
        head = null;
        tail = null;
        size = 0;
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

        size++;
    }

    public void addElementToMiddle(int value) {
        Node newElement = new Node(value);

        if (head == null) {
            head = newElement;
            tail = newElement;
        } else {
            int index = 1;
            Node iterator = head;
            while (index < size / 2) {
                iterator = iterator.next;
                index++;
            }

            newElement.next = iterator.next;
            iterator.next = newElement;
        }

        size++;
    }

    public void printElements() {
        Node iterator = head;

        while (iterator != null) {
            System.out.print(iterator.value + " ");
            iterator = iterator.next;
        }
        System.out.println();
    }
}
