package lesson32;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // Upcasting - Восходящее преобразование
        Animal animal = dog;

        // Downcasting - Нисходящее преобразование
        Dog dog1 = (Dog) animal;
        dog1.bark();

        // Меняет ссылку
        Animal animal1 = new Animal();
        Dog dog2 = (Dog) animal1;

        dog2.bark();

    }
}
