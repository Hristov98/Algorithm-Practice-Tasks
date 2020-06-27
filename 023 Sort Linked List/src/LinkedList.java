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

    public void sort() {
        Node current = head;
        Node iterator = current.next;

        while (current != null) {
            while (iterator != null) {
                if (current.value > iterator.value) {
                    int helper = current.value;
                    current.value = iterator.value;
                    iterator.value = helper;
                }
                iterator = iterator.next;
            }

            current = current.next;
            if(current!=null) {
                iterator = current.next;
            }
        }
    }
}
