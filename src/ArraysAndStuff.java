import java.util.ArrayList;

public class ArraysAndStuff {
    public static void main(String[] args){
        // --== Array ==--
        int[] myArray = new int[5]; // Static size and are reference types even if they contain primitives.

        myArray[0] = 97;
        myArray[1] = 5;
        myArray[2] = 11;
        myArray[3] = 2;
        myArray[4] = 34;

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        for (int j : myArray) {
            System.out.println(j);
        }

        // --== ArrayList ==--

        ArrayList<String> myArrList = new ArrayList<>(); // Dynamic size, is a generic and can only contain reference types

        myArrList.add("John");
        myArrList.add("Kyle");
        myArrList.add("Matthew");
        myArrList.add("Amanda");
        myArrList.add("Wendy");

        for(int i = 0; i < myArrList.size(); i++) {
            System.out.println(myArrList.get(i));
        }

        // --== Wrapper class ==--
        // There are 8 wrapper classes, one for each primitive type, which allow generics to handle primitives.
        ArrayList<Integer> myAL = new ArrayList<>();

        myAL.add(10); // 10 is a primitive which is boxed in the wrapper class as a reference type.

        // These can be used for converting strings to ints
        String foo = "450";
        int bar = Integer.parseInt(foo);
        bar += 10;
        System.out.println(bar);
    }
}
