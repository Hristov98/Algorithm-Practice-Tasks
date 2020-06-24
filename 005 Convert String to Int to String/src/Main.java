public class Main {
    public static void main(String[] args) {
        String number = "1234567";
        int convertedNumber = converStringToNumber(number);

        System.out.println(convertedNumber);
        System.out.println(convertNumberToString(convertedNumber));
        System.out.println(convertNumberToStringEasy(convertedNumber));
    }

    private static int converStringToNumber(String str) {
        char[] digits = str.toCharArray();
        int[] convertedDigits = new int[digits.length];
        int convertedNumber = 0;

        for (int i = 0; i < digits.length; i++) {
            convertedDigits[i] = (int) digits[i] - 48;
            convertedNumber += convertedDigits[i] * Math.pow(10, digits.length - i - 1);
        }

        return convertedNumber;
    }

    private static String convertNumberToString(int number) {
        int digitCount = 0;
        int numberCopy = number;

        while (numberCopy % 10 > 0) {
            digitCount++;
            numberCopy /= 10;
        }

        char[] digitSymbols = new char[digitCount];
        for (int i = 0; i < digitCount; i++) {
            digitSymbols[i] = (char) (number / (int)Math.pow(10, digitCount  - 1 - i) + '0');
            number = (int) (number % Math.pow(10, digitCount - 1 - i));
        }

        return new String(digitSymbols);
    }

    private static String convertNumberToStringEasy(int number) {
       return String.format("%d",number);
    }
}
