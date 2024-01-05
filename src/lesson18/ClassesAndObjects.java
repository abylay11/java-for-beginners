package lesson18;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Gleb");
        person.setAge(22);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.speak();
    }

}

class Person {
    private String name;
    private int age;

    public void setName(String name) {

        if (name.isEmpty()) {
            System.out.println("You enter empty name!");
            return;
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age should be positive number!");
            return;
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }
}
