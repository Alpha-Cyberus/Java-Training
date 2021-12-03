package theCompleteJavaDeveloperCourseOReilly;

public class MethodsAndOverloading {
    public static void main(String[] args) {
        /*
        // --== Different kinds of method
        printHello();

        printNumber(100);

        int result1 = ret10();
        System.out.println(result1);

        int result2 = addThese(10, 5);
        System.out.println(result2);

        // --== Method overloading
        int result = overloadExample(5);
        System.out.println(result);

        result = overloadExample(5, 4);
        System.out.println(result);

        result = overloadExample(5, "12");
        System.out.println(result);

        // --== Method calls
        doSomething();
        */

        // --== Recursion
        countDownFrom(10);
    }
    // --== Different kinds of method
    // void, parameterless method
    public static void printHello() {
        System.out.println("Hello world");
    }

    // void, parameterized
    public static void printNumber(int n) {
        System.out.println("Hello number " + n);
    }

    // returning, parameterless
    public static int ret10() {
        return 10;
    }

    // returning, parameterized
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    }

    // --== Method overloading
    public static int overloadExample(int num) {
        return num * 2;
    }
    public static int overloadExample(int num1, int num2) {
        return num1 + num2;
    }
    public static int overloadExample(int num, String str) {
        return num * Integer.parseInt(str);
    }

    // --== Method calls
    public static void doSomething() {
        System.out.println("Begin do something");

        int foo = getValue();

        System.out.println("result is " + foo);
    }

    public static int getValue() {
        return 100;
    }

    // --== Recursion
    public static void countDownFrom(int num) {
        if(num >= 0) {
            System.out.println(num);
            countDownFrom(num - 1);
        }
    }

}
