public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(-3, 3, 0, 0);
        Rectangle rect2 = new Rectangle(1, 3, 4, 0);
        Rectangle rect3 = new Rectangle(-3, 1, 2, -1);

        System.out.println(rectanglesOverlap(rect1, rect2));
        System.out.println(rectanglesOverlap(rect2, rect1));
        System.out.println(rectanglesOverlap(rect2, rect3));
        System.out.println(rectanglesOverlap(rect3, rect2));
        System.out.println(rectanglesOverlap(rect1, rect3));
        System.out.println(rectanglesOverlap(rect3, rect1));
    }

    private static boolean rectanglesOverlap(Rectangle r1, Rectangle r2) {
        if (r1.getLowerRightX() < r2.getUpperLeftX()) {
            return false; //r1 is to the left of r2
        }
        if (r1.getUpperLeftX() > r2.getLowerRightX()) {
            return false; //r1 is to the right of r2
        }
        if (r1.getLowerRightY() > r2.getUpperLeftY()) {
            return false; //r1 is above r2
        }
        if (r1.getUpperLeftY() < r2.getLowerRightY()) {
            return false; //r1 is below r2
        }

        return true;
    }
}
