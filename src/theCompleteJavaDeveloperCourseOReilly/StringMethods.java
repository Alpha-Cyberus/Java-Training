package theCompleteJavaDeveloperCourseOReilly;

public class StringMethods {
    public static void main(String[] args) {
        String name1 = "Dovahkiin";
        String name2 = "Aragon";
        String name3 = "Sabriel";

        if(name1.equals(name2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        if(name1.compareTo(name3) > 0) {
            System.out.println("More than");
        } else {
            System.out.println("Less than or equal");
        }

//        String upper = name1.toUpperCase();
//        String lower = name1.toLowerCase();
//        String firstHalf = name1.substring(4);
//        int findK = name1.indexOf("k");

        StringBuilder sb = new StringBuilder("Jim Darkmagic");
        sb.append(" is  aqesome");
        sb.insert(13, " of the New Hampshire Darkmagics");
        sb.replace(50, 52, "Aw");
        sb.delete(49, 50);
        System.out.println(sb);
    }
}
