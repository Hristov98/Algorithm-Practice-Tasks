public class Rectangle {
    private int upperLeftX;
    private int upperLeftY;
    private int lowerRightX;
    private int lowerRightY;

    Rectangle(int aX, int aY, int bX, int bY) {
        upperLeftX=aX;
        upperLeftY=aY;
        lowerRightX=bX;
        lowerRightY=bY;
    }

    public int getLowerRightX() {
        return lowerRightX;
    }

    public int getLowerRightY() {
        return lowerRightY;
    }

    public int getUpperLeftX() {
        return upperLeftX;
    }

    public int getUpperLeftY() {
        return upperLeftY;
    }
}
