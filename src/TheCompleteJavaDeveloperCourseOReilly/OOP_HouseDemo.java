package TheCompleteJavaDeveloperCourseOReilly;

public class OOP_HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House thyHouse = new House(3, 10, "White");

        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("Purple");

//        thyHouse.setNumStories(3);
//        thyHouse.setNumWindows(10);
//        thyHouse.setColor("White");

        System.out.println("My house is " + myHouse.getColor() +
                " and has " + myHouse.getNumStories() +
                " stories and " + myHouse.getNumWindows() + " windows.");
        System.out.println("Thy house is " + thyHouse.getColor() +
                " and has " + thyHouse.getNumStories() +
                " stories and " + thyHouse.getNumWindows() + " windows.");

    } // end main
}
