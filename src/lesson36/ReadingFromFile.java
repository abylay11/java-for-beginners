package lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "src/lesson36/text";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int[] nums = new int[numbers.length];
        int counter = 0;

        for (String number : numbers) {
            nums[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(nums));

        scanner.close();
    }
}
