package TheCompleteJavaDeveloperCourseOReilly;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput {
    public static void main(String[] args) {

        try {
            PrintWriter pW = new PrintWriter("output.txt");

            pW.println("Hello file.");
            pW.println("My name is Luffy.");

            pW.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Write to file failed.");
        }
    }
}
