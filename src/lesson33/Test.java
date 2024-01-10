package lesson33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // --- before Java 5 ---
        ArrayList list = new ArrayList();
        Animal animalO = new Animal();
        list.add("cat");
        list.add("dog");
        list.add("frog");
        list.add(animalO);

        String animal = (String) list.get(1);

        System.out.println(animal);

        // Generics
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String anibal2 = animals.get(1);
        System.out.println(anibal2);

        // Java 7
        List<String> animals3 = new ArrayList<>();
    }
}

class Animal {

}
