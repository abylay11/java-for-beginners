package lesson14;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Абылай";
        person1.age = 22;

        System.out.println(person1.name);
        System.out.println(person1.age);

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 30;

        System.out.println(person2.name);
        System.out.println(person2.age);
    }

}

class Person {
    // У класса могут быть:
    // 1. Данныке (поля)
    // 2. Действия, которые он может совершать (методы)

    String name;
    int age;
}
