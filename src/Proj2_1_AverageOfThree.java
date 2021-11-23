import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputCount = 3;
        float realNum1;
        float realNum3;
        float realNum2;

        System.out.println("Enter 3 numbers");
        realNum1 = keyboard.nextFloat();
        realNum2 = keyboard.nextFloat();
        realNum3 = keyboard.nextFloat();
        keyboard.nextLine();

        float result = (realNum1 + realNum2 + realNum3) / inputCount;

        System.out.println("Average: " + result);
    }
}
