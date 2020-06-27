import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str1 = "aabbccddeeffhgghhabcdf";
        String str2 = "This is a test string.";
        String str3 = "aaaaaaaaaaaaaaaaaaaaaaaaaa";

        System.out.println(str1);
        System.out.println(findAllMostCommonCharacter(str1));

        System.out.println(str2);
        System.out.println(findAllMostCommonCharacter(str2));

        System.out.println(str3);
        System.out.println(findAllMostCommonCharacter(str3));
    }

    private static char findFirstMostCommonCharacter(String str) {
        LinkedHashMap<Character, Integer> symbols = new LinkedHashMap<>();

        for (char symbol : str.toCharArray()) {
            if (symbols.containsKey(symbol)) {
                symbols.put(symbol, symbols.get(symbol) + 1);
            } else {
                symbols.put(symbol, 1);
            }
        }

        int maxOccurrences = 0;
        char mostCommonSymbol = 0;
        for (Map.Entry<Character, Integer> pair : symbols.entrySet()) {
            if (maxOccurrences < pair.getValue()) {
                maxOccurrences = pair.getValue();
                mostCommonSymbol = pair.getKey();
            }
        }

        return mostCommonSymbol;
    }

    private static String findAllMostCommonCharacter(String str) {
        LinkedHashMap<Character, Integer> symbols = new LinkedHashMap<>();

        for (char symbol : str.toCharArray()) {
            if (symbols.containsKey(symbol)) {
                symbols.put(symbol, symbols.get(symbol) + 1);
            } else {
                symbols.put(symbol, 1);
            }
        }

        int maxOccurrences = 0;
        for (Map.Entry<Character, Integer> pair : symbols.entrySet()) {
            if (maxOccurrences < pair.getValue()) {
                maxOccurrences = pair.getValue();
            }
        }

        ArrayList<Character> mostCommonSymbols = new ArrayList<>();
        for (Map.Entry<Character, Integer> pair : symbols.entrySet()) {
            if (maxOccurrences == pair.getValue()) {
                mostCommonSymbols.add(pair.getKey());
            }
        }

        return mostCommonSymbols.toString() + String.format(" with %d appearances\n", maxOccurrences) ;
    }
}
