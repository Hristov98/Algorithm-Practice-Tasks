public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 0, 2, 1, 330};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] arr, int leftBoundary, int rightBoundary) {
        if (leftBoundary < rightBoundary) {
            int middleIndex = (rightBoundary + leftBoundary) / 2;
            mergeSort(arr, leftBoundary, middleIndex);
            mergeSort(arr, middleIndex + 1, rightBoundary);

            int firstHalfSize = middleIndex - leftBoundary + 1;
            int secondHalfSize = rightBoundary - middleIndex;
            int firstHalfIndex = 0;
            int secondHalfIndex = 0;
            int mergedArrayIndex = leftBoundary;

            int[] firstHalfArray = new int[firstHalfSize];
            int[] secondHalfArray = new int[secondHalfSize];

            for (int i = 0; i < firstHalfSize; i++) {
                firstHalfArray[i] = arr[leftBoundary + i];
            }

            for (int i = 0; i < secondHalfSize; i++) {
                secondHalfArray[i] = arr[middleIndex + 1 + i];
            }

            while (firstHalfIndex < firstHalfSize && secondHalfIndex < secondHalfSize) {
                if (firstHalfArray[firstHalfIndex] <= secondHalfArray[secondHalfIndex]) {
                    arr[mergedArrayIndex++] = firstHalfArray[firstHalfIndex++];
                } else {
                    arr[mergedArrayIndex++] = secondHalfArray[secondHalfIndex++];
                }
            }

            while (firstHalfIndex < firstHalfSize) {
                arr[mergedArrayIndex++] = firstHalfArray[firstHalfIndex++];
            }

            while (secondHalfIndex < secondHalfSize) {
                arr[mergedArrayIndex++] = secondHalfArray[secondHalfIndex++];
            }
        }
    }

}
