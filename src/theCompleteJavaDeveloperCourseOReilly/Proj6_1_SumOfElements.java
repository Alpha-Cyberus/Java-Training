package theCompleteJavaDeveloperCourseOReilly;

import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> foo = new ArrayList<>();

        foo.add(5);
        foo.add(5);
        foo.add(5);
        foo.add(5);

        System.out.println(sumElements(foo));
    }

    public static int sumElements(ArrayList<Integer> bar) {
        int myCounter = 0;
        for (int j:bar) {
            myCounter += j;
        }
        return myCounter;
    }
}
