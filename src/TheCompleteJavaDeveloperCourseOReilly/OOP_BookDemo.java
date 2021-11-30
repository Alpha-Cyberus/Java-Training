package TheCompleteJavaDeveloperCourseOReilly;

public class OOP_BookDemo {
    public static void main(String[] args) {
        Book lordOfTheRings = new Book("J.R.R.Tolkien",
                "The Lord Of The Rings",
                "Fantasy",
                1234);
        Book mathBook = new Book("Smart guy",
                "Maths and Stuff",
                "Education",
                999);
        Book javaBook = new Book("Nerd guy",
                "Code and stuff",
                "Education",
                987);

//        printBookDetails(lordOfTheRings);
//        printBookDetails(mathBook);
//        printBookDetails(javaBook);
        lordOfTheRings.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();
    }

//    public static void printBookDetails(Book book) {
//        System.out.println(book.getTitle());
//        System.out.println("by " + book.getAuthor());
//        System.out.println("has "+ book.getNumPages() +
//                " pages, and its genre is " + book.getGenre());
//
//        System.out.println();
//    }
}
