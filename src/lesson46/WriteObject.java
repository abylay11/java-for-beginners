package lesson46;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] peoples = {
                new Person(1, "Bob"),
                new Person(2, "Mike"),
                new Person(3, "Tom")
        };

        try {
            FileOutputStream fos = new FileOutputStream("src/lesson45/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

//            oos.writeInt(peoples.length);
//            for (Person person :  peoples) {
//                oos.writeObject(person);
//            }

            oos.writeObject(peoples);

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
