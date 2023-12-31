package lesson26;

public class Test {

    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.sayHello();

        System.out.println("---");

        animal1.showInfo();
        person1.showInfo();

        System.out.println("---");

        Info info1 = new Animal(2);
        Info info2 = new Person("David");

        info1.showInfo();
        info2.showInfo();

        System.out.println("---");

        outputInfo(animal1);
        outputInfo(person1);
        
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }

}
