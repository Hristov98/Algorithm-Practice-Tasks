public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            if (i == 13) { //indexes of array are 0-99 while the values are 1-100
                continue;
            }
            arr[i] = i + 1;
        }

        System.out.println(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        int sumOneToOneHundred = 0;
        int sumWithMissing = 0;
        for (int i = 1; i <= 100; i++) {
            sumOneToOneHundred += i;
        }
        for (int i = 0; i < 100; i++) {
            sumWithMissing += arr[i];
        }

        return sumOneToOneHundred - sumWithMissing;
    }
}
