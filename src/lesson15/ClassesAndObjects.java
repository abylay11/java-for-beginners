package lesson15;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Роман";
        person.age = 40;
        person.speak();
        person.sayHello();
    }

}

class Person {
    // У класса могут быть:
    // 1. Данныке (поля)
    // 2. Действия, которые он может совершать (методы)

    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }

    void sayHello() {
        System.out.println("Привт!");
    }
}
