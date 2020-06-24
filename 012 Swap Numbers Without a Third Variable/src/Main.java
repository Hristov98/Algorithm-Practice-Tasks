public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c = 125;

        System.out.println(a + " " + b);
        swapVariables(a,b);

        System.out.println(b + " " + c);
        swapVariables(b,c);

        System.out.println(c + " " + a);
        swapVariables(c,a);
    }

    private static void swapVariables(int first, int second) {
        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println(first + " " + second + '\n');
    }
}
