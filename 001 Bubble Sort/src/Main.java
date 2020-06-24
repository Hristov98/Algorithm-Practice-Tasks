public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 8, 27, 0, 5, 4, 0, 2, 1, 0};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int helper = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = helper;
                }
            }
        }
    }
}
