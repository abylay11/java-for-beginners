package lesson24;

public class Lesson24 {

    public static void main(String[] args) {
        String s = "Some string";
        System.out.println(s);

        System.out.println("---");

        Human human = new Human("David", 18);

        // without override toString method (lesson24.Human@5b480cf9)
        String humanString = human.toString();
        System.out.println(humanString);

    }

}

class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Human hash code: ").append(this.hashCode()).append("\n");
        stringBuilder.append("Name: ").append(name).append("\n");
        stringBuilder.append("Age: ").append(age).append("\n");

        return stringBuilder.toString();
    }
}
