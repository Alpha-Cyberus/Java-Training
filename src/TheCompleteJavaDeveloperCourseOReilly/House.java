package TheCompleteJavaDeveloperCourseOReilly;

public class House {
    // These are fields.
    private int numStories;
    private int numWindows;
    private String color;

    public House() {
        numStories = 1;
        numWindows = 4;
        color = "grey";
    }

    public House(int numStories, int numWindows, String color) {
        this.numStories = numStories;
        this.numWindows = numWindows;
        this.color = color;
    }

    // These are instance methods, getters and setters.
    public int getNumStories() {
        return numStories;
    }
    public void setNumStories(int numStories) {
        this.numStories = numStories;
    }

    public int getNumWindows() {
        return numWindows;
    }
    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
} // end OOP_House
