package lesson7;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
//        String myString = new String("hello"); // create String object. String class in packet java.lang
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text:");
        String string = scanner.nextLine();
        System.out.println("You enter: " + string);
        System.out.println("Enter some integer:");
        int x = scanner.nextInt();
        System.out.println("You enter: " + x);
    }

}
