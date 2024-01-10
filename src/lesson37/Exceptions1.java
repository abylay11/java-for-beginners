package lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main.");
//            throw new RuntimeException(e);
        }
    }

    public static void readFile() throws FileNotFoundException {
        String path = "src/lesson37/testFile";
        path = "asdf";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
    }
}
