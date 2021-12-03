package theCompleteJavaDeveloperCourseOReilly;

public class Proj7_3_CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(12.34);

        printCircleData(c1);
        printCircleData(c2);
        printCircleData(c3);
    }

    public static void printCircleData(Circle c) {
        System.out.println("Radius: " + c.getRadius() +
                "\nCircumference: " + String.format("%.2f", c.circumference()) +
                "\nArea: " + String.format("%.2f", c.area()) +
                "\n");
    }
}
