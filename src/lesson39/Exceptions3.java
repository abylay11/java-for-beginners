package lesson39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        // Checked exceptions (Compile time exceptions) - исключительные случай
        // Unchecked exceptions (Runtime exceptions) - ошибка при работе программы

        // 1) Checked example
//        File file = new File("asdf");
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        // 2) Unchecked exception
        int[] array = new int[3];
        System.out.println(array[10]);

    }
}
