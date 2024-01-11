package lesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/lesson44/testFile");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Test row one");
        printWriter.println("Test row 2");

        printWriter.close();
    }
}
