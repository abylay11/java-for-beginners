package lesson25;

public class Lesson25 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println("---");

        Dog dog = new Dog();
        dog.name = "Sandy";

        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();
    }

}
