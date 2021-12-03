package theCompleteJavaDeveloperCourseOReilly;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectList = new ArrayList<>();

        fillArrList(rectList);
        printArrList(rectList);
    }

    public static void fillArrList(ArrayList<Rectangle> rectList) {
        Scanner inFile;

        try {
            inFile = new Scanner(new File("rectangle_data.txt"));
            Rectangle tempR;
            double length;
            double width;
//            String temp;

            while (inFile.hasNext()) {
//                Method from tic-tac-toe
//                temp = inFile.nextLine();
//                length = Integer.parseInt(temp.substring(0,1));
//                width = Integer.parseInt(temp.substring(2));

                // Faster more direct method
                length = inFile.nextDouble();
                width = inFile.nextDouble();

                tempR = new Rectangle(length, width);
                rectList.add(tempR);
            }

            inFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("404");
        }
    }

    public static void printArrList(ArrayList<Rectangle> rectList) {
        for (Rectangle r : rectList) {
            // Why doesn't this work in loops?
//            System.out.println("L: " + r.getLength() +
//                    "\rW: " + r.getWidth() +
//                    "\rA: " + r.area() +
//                    "\rP: " + r.perimiter() +
//                    "\r");

            System.out.println("Length: " + r.getLength());
            System.out.println("Width: " + r.getWidth());
            System.out.println("Area: " + String.format("%.2f", r.area()));
            System.out.println("Perimiter: " + String.format("%.2f", r.perimiter()));
            System.out.println();
        }
    }
}
