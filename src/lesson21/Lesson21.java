package lesson21;

public class Lesson21 {

    public static void main(String[] args) {
        // Lesson 21
        // Ключевое слова static

        Human human = new Human("Bob", 30);
        human.setName("Tom");
        human.setAge(12);

        Human human1 = new Human("Jon", 32);

        Human.description = "Nice";
        Human.getDescription();

        human.getAllFields();
        human1.getAllFields();

        double res = Math.pow(2, 4);
        System.out.println("Res: " + res);
        System.out.println("Math PI: " + Math.PI);

        human.getNumberOfPeople();
    }

}

class Human {
    private String name;
    private int age;

    public static String description;
    public static int countPeople;

//    public Human() {
//        this("Bob", 12);
//    }

//    public Human(String name) {
//        System.out.println("Привет из второго конструктора");
//        this.name = name;
//    }

    public Human(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
        System.out.println("Description: " + description);
    }

    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }

    public void getNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }
}
