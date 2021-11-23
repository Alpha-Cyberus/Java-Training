import java.util.Random;

public class Randomness {
    public static void main(String[] args) {
        Random rand = new Random();
        int myVar;

        myVar = rand.nextInt(); // -2,147,483,248 to 2,147,483,247
        System.out.println("Random number is:\t" + myVar);

        myVar = rand.nextInt(1000); // 0 to 999
        System.out.println("Random number 0-999 is:\t" + myVar);

        myVar = rand.nextInt(1000) + 1; // 0 to 999
        System.out.println("Random number 1-1000 is:\t" + myVar);
    }

}
