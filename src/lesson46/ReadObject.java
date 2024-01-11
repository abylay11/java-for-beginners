package lesson46;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/lesson45/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

//            int countOfPeople = ois.readInt();
//            Person[] peoples = new Person[countOfPeople];
//
//            for (int i = 0; i < countOfPeople; i++) {
//                peoples[i] = (Person) ois.readObject();
//            }

            Person[] peoples = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(peoples));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
