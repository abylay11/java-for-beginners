package lesson20;

public class Lesson20 {

    public static void main(String[] args) {
        Human human = new Human("Martin", 22);
        human.printInfo();

        Human human1 = new Human();
        human1.printInfo();
    }

}

class Human {
    private String name;
    private int age;

    public Human() {
        this.name = "Default name";
        this.age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name + ", " + age);
    }
}
