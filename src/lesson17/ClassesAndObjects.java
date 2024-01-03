package lesson17;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person = new Person();
        person.setNameAndAge("Роман", 40);
        person.speak();
        person.sayHello();
        int year1 = person.calculateYearsToRetirement();
        System.out.println(year1);
    }

}

class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement() {
        return 65 - age;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }

    void sayHello() {
        System.out.println("Привт!");
    }
}
