public class Main {
    public static void main(String[] args) {
        String str1 = "abcdefghijklmnop";
        String str2 = "This is a test string.";
        String str3 = "a s 2 4 6 2 1 a s f";

        System.out.println(str1);
        reverseString(str1);

        System.out.println(str2);
        reverseString(str2);

        System.out.println(str3);
        reverseString(str3);
    }

    private static void reverseString(String str) {
        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        char[] symbols = str.toCharArray();
        while (leftIndex < rightIndex) {
            char helper = symbols[leftIndex];
            symbols[leftIndex] = symbols[rightIndex];
            symbols[rightIndex] = helper;

            leftIndex++;
            rightIndex--;
        }

        System.out.println(new String(symbols));
    }
}
