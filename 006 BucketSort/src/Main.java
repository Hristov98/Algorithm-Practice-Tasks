import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1,23,434,4,54,1,1,2,124,124,12,76,45,45,3 };

        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();

        bucketSort(arr);

        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void bucketSort(int[] arr) {
        int[] hashCode = getHashCode(arr);

        ArrayList<Integer>[] buckets = new ArrayList[hashCode[1]];
        for (int i = 0; i < hashCode[1]; i++) {
            buckets[i] = new ArrayList();
        }
        for (int number : arr) {
            buckets[getHash(number, hashCode)].add(number);
        }

        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (Object o : bucket) {
                arr[index++] = (int) o;
            }
        }
    }

    private static int[] getHashCode(int[] arr) {
        int smallest = arr[0];
        for (int number : arr) {
            if (smallest < number) {
                smallest = number;
            }
        }

        return new int[]{smallest, (int) Math.sqrt(arr.length)};
    }

    private static int getHash(int i, int[] hashCode) {
        return (int) ((double) i / hashCode[0] * (hashCode[1] - 1));
    }
}
