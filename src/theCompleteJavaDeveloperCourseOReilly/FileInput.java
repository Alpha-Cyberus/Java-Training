package theCompleteJavaDeveloperCourseOReilly;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        Scanner infile;

        try {
            infile = new Scanner(new File("input.txt"));
            int input;

            while (infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
            }

            infile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Error reading input!");
        }
    }
}
