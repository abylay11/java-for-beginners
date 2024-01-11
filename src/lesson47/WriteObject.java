package lesson47;

import lesson46.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Tim");

        System.out.println("person1: " + person1);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/lesson47/people.bin"))) {
            oos.writeObject(person1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
