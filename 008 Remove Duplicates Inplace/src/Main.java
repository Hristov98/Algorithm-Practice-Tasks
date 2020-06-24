public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 19, 4, 5, 6, 27, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 145, 10, 1, 1};
        int[] arr2 = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        int[] arr3 = {6, 6, 6, 6, 6, 6, 6};


        for (int number : arr1) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int number : arr2) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int number : arr3) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        removeDuplicatesAndPrint(arr1);
        removeDuplicatesAndPrint(arr2);
        removeDuplicatesAndPrint(arr3);
    }

    private static void removeDuplicatesAndPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = Integer.MAX_VALUE;
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Integer.MAX_VALUE) {
                counter++;
            }
        }

        int otherCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] == Integer.MAX_VALUE && otherCounter < counter) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                otherCounter++;
            }
        }

        for (int i = 0; i < arr.length-counter; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

