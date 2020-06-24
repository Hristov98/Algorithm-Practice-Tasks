public class Main {
    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 4, 1, 5, 5, 4, 2, 5, 2, 1, 7, 86, 32, 45, 3, 4, 2, 44, 2};

        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        findSmallestAndLargestNumber(arr1);
        System.out.println();

        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
        findSmallestAndLargestNumber(arr2);
        System.out.println();
    }

    private static void findSmallestAndLargestNumber(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];

        for (int num : arr) {
            if (smallest > num) {
                smallest = num;
            }
            if (largest < num) {
                largest = num;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
