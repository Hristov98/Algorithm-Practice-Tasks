import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[30];

        for (int i =0;i<arr.length;i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] arr) {
       int i = 1;

       while (i < arr.length) {
           int j = i;
           while (j > 0 && arr[j] < arr[j-1]) {
               int helper = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = helper;

               j--;
           }

           i++;
       }

    }
}
