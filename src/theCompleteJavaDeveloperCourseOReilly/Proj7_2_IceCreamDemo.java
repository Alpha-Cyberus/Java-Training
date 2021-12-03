package theCompleteJavaDeveloperCourseOReilly;

public class Proj7_2_IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC = new IceCream("Peanut butter", 3, 2);
        IceCream yourIC = new IceCream("Cholocate", 2, 1);

        myIC.addTopping("nuts");
        myIC.addTopping("flake");
        yourIC.addTopping("smarties");

        printIC(myIC);
        printIC(yourIC);
    }

    public static void printIC(IceCream iC) {
        System.out.println(iC.getName());
        System.out.println("Cost: " + iC.getCost());
        System.out.print("Topped with: ");
        iC.printToppings();
        System.out.println();
    }
}
