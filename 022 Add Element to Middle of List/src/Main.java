public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.addElement(i + 1);
        }

        list.printElements();
        list.addElementToMiddle(11);
        list.printElements();
        list.addElementToMiddle(12);
        list.printElements();
        list.addElementToMiddle(13);
        list.printElements();

        LinkedList list2 = new LinkedList();

        list2.printElements();
        list2.addElementToMiddle(1);
        list2.printElements();
        list2.addElementToMiddle(2);
        list2.printElements();
        list2.addElementToMiddle(3);
        list2.printElements();
        list2.addElementToMiddle(4);
        list2.printElements();
        list2.addElementToMiddle(5);
        list2.printElements();
    }

}
