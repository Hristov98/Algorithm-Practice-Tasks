public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 23, 434, 4, 54, 1, 1, 2, 124, 124, 12, 76, 45, 45, 3};

        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();

        countingSort(arr);

        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void countingSort(int[] arr) {
        int largest = arr[0];

        for (int number : arr) {
            if (largest < number) {
                largest = number;
            }
        }

        int[] occurrences = new int[largest];

        for (int number : arr) {
            occurrences[number - 1]++;
        }

        int index = 0;
        for (int i = 0; i < occurrences.length;i++) {
            while (occurrences[i] > 0) {
                arr[index++] = i+1;
                occurrences[i]--;
            }
        }
    }
}
