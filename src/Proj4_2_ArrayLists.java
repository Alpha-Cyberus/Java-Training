import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Double> arrList = new ArrayList<>();
        Scanner kbd = new Scanner(System.in);

        System.out.println("Write any numbers, write negative numbers to stop.");

        do {
            double foo = kbd.nextDouble();

            if (foo >=0) {
                arrList.add(foo);
            } else {
                break;
            }
        } while (true);

        for (int i = arrList.size() - 1; i >= 0; i--) {
            System.out.println(arrList.get(i));
        }
    }
}
