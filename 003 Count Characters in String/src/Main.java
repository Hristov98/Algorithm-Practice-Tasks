import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "This is a test question!";

        System.out.println(str);
        System.out.println("t: " + countCharacter(str,'t'));
        System.out.println("i: " + countCharacter(str,'i'));
        System.out.println("e: " + countCharacter(str,'e'));
        System.out.println("T: " + countCharacter(str,'T'));
        countCharacters(str);
    }

    private static int countCharacter(String str, char c) {
        int charCounter=0;

        for (char symbol: str.toCharArray()) {
            if (symbol == c) {
                charCounter++;
            }
        }

        return charCounter;
    }

    private static void countCharacters(String str) {
        LinkedHashMap<Character,Integer> charCounter = new LinkedHashMap<>();

        for (char symbol: str.toCharArray()) {
            charCounter.put(symbol,0);
        }

        for (Map.Entry<Character,Integer> symbol: charCounter.entrySet()) {
            for (char c: str.toCharArray()) {
                if (symbol.getKey() == c) {
                    charCounter.put(symbol.getKey(),symbol.getValue()+1);
                }
            }
        }

        System.out.println(charCounter);
    }
}
