import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 10; i > 0; i--) {
            list.addElement(i);
        }

        list.printElements();
        list.sort();
        list.printElements();

        LinkedList list2 = new LinkedList();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            list2.addElement(rand.nextInt(50));
        }

        list2.printElements();
        list2.sort();
        list2.printElements();
    }

}
