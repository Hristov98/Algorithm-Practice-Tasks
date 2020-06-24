public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 23, 434, 4, 54, 1, 1, 2, 124, 124, 12, 76, 45, 45, 3};
        int[] arr2 = {99, 77, 33, 22, 11, 65, 34, 77, 77, 87, 1, 66};

        printArrays(arr, arr2);

        radixSort(arr);
        radixSort(arr2);

        printArrays(arr, arr2);
    }

    private static void printArrays(int[] arr, int[] arr2) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : arr2) {
            System.out.print(number + " ");
        }
        System.out.println('\n');
    }

    private static void radixSort(int[] arr) {
        int max = getMax(arr);

        for (int power = 1; max / power > 0; power *= 10) {
            sortByDigit(arr, power);
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    private static void sortByDigit(int[] arr, int power) {
        int[] output = new int[arr.length];
        int[] countArr = new int[10];

        for (int number : arr) {
            countArr[(number / power) % 10]++;
        }

        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[countArr[(arr[i] / power) % 10] - 1] = arr[i];
            countArr[(arr[i] / power) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

}
