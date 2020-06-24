public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 19, 4, 5, 6, 27, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 145, 10, 1, 1};
        int[] arr2 = {9,8,7,6,5,4,3,2,1};
        int[] arr3 = {9,8,7,6,5,12,4,3,2,1};

        printArrays(arr1, arr2, arr3);
        System.out.println("\n");

        reverseArray(arr1);
        reverseArray(arr2);
        reverseArray(arr3);

        printArrays(arr1, arr2, arr3);
    }

    private static void printArrays(int[] arr1, int[] arr2, int[] arr3) {
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
    }

    private static void reverseArray(int[] arr) {
        int leftIndex= 0;
        int rightIndex= arr.length-1;

        while (leftIndex < rightIndex) {
            int helper = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = helper;

            leftIndex++;
            rightIndex--;
        }
    }

}

