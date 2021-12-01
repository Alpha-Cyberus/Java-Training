package TheCompleteJavaDeveloperCourseOReilly;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Project8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();

        getCircles(circles);
        printCircles(circles);
    }

    public static void getCircles(ArrayList<Circle> c) {
        Scanner radFile;

        try {
            radFile = new Scanner(new File("circle_data.txt"));

            while (radFile.hasNext()) {
                c.add(new Circle(radFile.nextDouble()));
            }

            radFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("404");
        }
    }

    public static void printCircles(ArrayList<Circle> c) {
        PrintWriter pW;

        try {
            pW = new PrintWriter("circle_outputs.txt");

            for (Circle o : c) {
                pW.println("Radius: " + o.getRadius());
                pW.println("Circumference: " + String.format("%.2f", o.circumference()));
                pW.println("Area: " + String.format("%.2f", o.area()));
                pW.println();

                System.out.println("Radius: " + o.getRadius());
                System.out.println("Circumference: " + String.format("%.2f", o.circumference()));
                System.out.println("Area: " + String.format("%.2f", o.area()));
                System.out.println();
            }

            pW.close();
        } catch (FileNotFoundException ex) {
            System.out.println("404");
        }
    }
}
