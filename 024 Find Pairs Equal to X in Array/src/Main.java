import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[30];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(50);
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        printPairsNaive(numbers);
        printPairs(numbers);
    }

    private static void printPairsNaive(int[] arr) {
        System.out.println("Naive algorithm with complexity of n^2");
        for (int i = 5; i <= 40; i += 5) {
            System.out.printf("For sum %d: ", i);
            printPairsForNumberNaive(arr, i);
            System.out.println();
        }
    }

    private static void printPairsForNumberNaive(int[] arr, int value) {
        boolean pairExists = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    System.out.printf("(%d, %d) ", arr[i], arr[j]);
                    pairExists = true;
                }
            }
        }

        if (!pairExists) {
            System.out.print("None found");
        }
    }

    private static void printPairs(int[] arr) {
        System.out.println("Improved algorithm using sets. Complexity n but prints double pairs.");
        for (int i = 5; i <= 40; i += 5) {
            System.out.printf("For sum %d: ", i);
            printPairsForNumber(arr, i);
            System.out.println();
        }
    }

    private static void printPairsForNumber(int[] arr, int value) {
        boolean pairExists = false;
        Map<Integer, Integer> occurrences = new LinkedHashMap<>();

        for (int number : arr) {
            if (occurrences.containsKey(number)) {
                occurrences.put(number, occurrences.get(number) + 1);
            } else {
                occurrences.put(number, 1);
            }
        }

        for (int firstNumber : arr) {
            int secondNumber = value - firstNumber;
            if (occurrences.containsKey(secondNumber)) {
                System.out.printf("(%d, %d) ", firstNumber, secondNumber);
                pairExists = true;
            }
        }

        if (!pairExists) {
            System.out.print("None found");
        }
    }
}
