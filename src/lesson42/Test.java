package lesson42;

public class Test {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == 1);

        //  animal1 -> {1}
        //  animal2 -> {1}

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        Animal animal3 = animal1;

        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));

        System.out.println(animal1 == animal3);

        String s1 = "Hello world";
        String s2 = "Hello world";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String a = "hello";
        String b = "hello1234".substring(0, 5);

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == b);

    }

}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        Animal animal = (Animal) object;    // down casting

        return this.id == animal.id;
    }
}
