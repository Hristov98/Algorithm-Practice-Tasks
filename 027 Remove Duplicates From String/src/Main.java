import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        String str1 = "aabbccddeeffhgghhabcdf";
        String str2 = "This is a test string.";
        String str3 = "aaaaaaaaaaaaaaaaaaaaaaaaaa";

        System.out.println("Before: " + str1);
        System.out.println("After: " + removeDuplicates(str1));
        System.out.println("Before: " + str2);
        System.out.println("After: " + removeDuplicates(str2));
        System.out.println("Before: " + str3);
        System.out.println("After: " + removeDuplicates(str3));

    }

    private static String removeDuplicates(String str) {
        LinkedHashSet<Character> symbols = new LinkedHashSet<>();

        for (char symbol : str.toCharArray()) {
            symbols.add(symbol);
        }

        char[] noDuplicates = new char[symbols.size()];
        int index = 0;
        for (Character symbol : symbols) {
            noDuplicates[index++] = symbol;
        }

        return new String(noDuplicates);
    }
}
