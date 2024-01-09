package lesson23;

public class Lesson23 {

/*
    public static void main(String[] args) {
        // Lesson 23
        // StringBuilder

        String s = "hello";     // String class objects immutable
        s = s.toUpperCase();    // method return new object
        System.out.println("Uppercase: " + s);  // print new object that refs 's' variable

        System.out.println("---");

        String string1 = "Hello";   // create object 1
        String string2 = " from";   // create object 2
        String string3 = " Kazakhstan.";    // create object 3

        // string1 + string 2 = new String()
        // but it is slow than StringBuilder class
        String allStrings = string1 + string2 + string3;

        System.out.println("All strings: " + allStrings);

        System.out.println("---");

        StringBuilder sb;
        sb = new StringBuilder("Languages:\n");
        sb.append("Java\n");
        sb.append("Kotlin\n").append("Switch\n").append("JavaScript\n");

        System.out.println("String builder - " + sb);
    }
 */

    public static void main(String[] args) {
        // Lesson 23(continue)
        // Форматирование сторок в Java

        System.out.printf("Some string: %s\n", "Hello world!");
        System.out.printf("Some digit: %d\n", 10);
        System.out.printf("Some float: %f\n", 12.1312);

        System.out.println("---");

        System.out.printf("Some string: %15s\n", "Hello!");
        System.out.printf("Some digit: %15d\n", 10);
        System.out.printf("Some float: %15f\n", 12.1312);

        System.out.println("---");

        System.out.printf("Some float: %15.2f\n", 145.5635);
        System.out.printf("Some float: %15.2f\n", 4.43456);
        System.out.printf("Some float: %15.2f\n", 12.1312);

    }

}
