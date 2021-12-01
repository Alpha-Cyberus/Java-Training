package TheCompleteJavaDeveloperCourseOReilly;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double rad) {
        this.radius = rad;
    }

    public double circumference() {
        return (2 * Math.PI * this.radius);
    }

    public double area() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
}
