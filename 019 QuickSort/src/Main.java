public class Main {
    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 4, 1, 5, 5, 4, 2, 5, 2, 1, 7, 86, 32, 45, 3, 4, 2, 44, 2};

        printArr(arr1, arr2);

        //recursiveQuickSort(arr1, 0, arr1.length - 1);
        recursiveQuickSort(arr2, 0, arr2.length - 1);
        iterativeQuickSort(arr1,0,arr1.length-1);
        //iterativeQuickSort(arr2,0,arr2.length-1);

        printArr(arr1, arr2);
    }

    private static void printArr(int[] arr1, int[] arr2) {
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println('\n');
    }


    private static void recursiveQuickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = arr[(left + right) / 2];
            int i = left;
            int j = right;

            while (i <= j) {
                while (arr[i] < pivot) {
                    i++;
                }
                while (arr[j] > pivot) {
                    j--;
                }

                if (i <= j) {
                    int helper = arr[i];
                    arr[i] = arr[j];
                    arr[j] = helper;
                    i++;
                    j--;
                }
            }

            if (left < j) {
                recursiveQuickSort(arr, left, j);
            }
            if (i < right) {
                recursiveQuickSort(arr, i, right);
            }
        }
    }

    private static void iterativeQuickSort(int[] arr, int left, int right) {
        int[] stack = new int[right - left + 1];
        int top = -1;

        stack[++top] = left;
        stack[++top] = right;

        while (top >= 0) {
            right = stack[top--];
            left = stack[top--];

            int pivot = arr[(left + right) / 2];
            int i = left;
            int j = right;

            while (i <= j) {
                while (arr[i] < pivot) {
                    i++;
                }
                while (arr[j] > pivot) {
                    j--;
                }

                if (i <= j) {
                    int helper = arr[i];
                    arr[i] = arr[j];
                    arr[j] = helper;
                    i++;
                    j--;
                }
            }

            if (left < j) {
                stack[++top] = left;
                stack[++top] = j;
            }

            if (i < right) {
                stack[++top] = i;
                stack[++top] = right;
            }

        }
    }
}
