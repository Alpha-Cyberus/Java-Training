package TheCompleteJavaDeveloperCourseOReilly;

public class Rectangle {
    private double length;
    private double width;

    private static int numRectangles;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numRectangles++;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimiter() { return (length * 2) + (width * 2); }

    public static int getNumRectangles() {
        return numRectangles;
    }
}
