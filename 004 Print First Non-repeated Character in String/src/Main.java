import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "this is a test question!";

        printFirstNonDuplicateCharacter(str);
        printFirstNonDuplicateCharacter("swiss cheese!");

    }

    private static int countCharacter(String str, char c) {
        int charCounter = 0;

        for (char symbol : str.toCharArray()) {
            if (symbol == c) {
                charCounter++;
            }
        }

        return charCounter;
    }

    private static void printFirstNonDuplicateCharacter(String str) {
        LinkedHashMap<Character, Boolean> duplicateSymbols = new LinkedHashMap<>();

        for (char symbol : str.toCharArray()) {
            duplicateSymbols.put(symbol, false);
        }

        int charCounter = 0;
        for (Map.Entry<Character, Boolean> symbol : duplicateSymbols.entrySet()) {
            for (char c : str.toCharArray()) {
                if (symbol.getKey() == c) {
                    charCounter++;
                }

                if (charCounter > 1) {
                    duplicateSymbols.put(symbol.getKey(), true);
                    charCounter = 0;
                    break;
                }
            }
        }

        for (Map.Entry<Character, Boolean> symbol : duplicateSymbols.entrySet()) {
            if (!symbol.getValue()) {
                System.out.println(symbol.getKey());
                break;
            }
        }

    }
}
