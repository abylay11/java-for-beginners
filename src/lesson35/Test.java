package lesson35;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Animal() {
            @Override
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };
        animal1.eat();

//        OtherAnimal otherAnimal = new OtherAnimal();
//        otherAnimal.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };

        ableToEat.eat();
    }
}

interface AbleToEat {
    public void eat();
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}

//class OtherAnimal extends Animal {
//    @Override
//    public void eat() {
//        System.out.println("Other animal is eating...");
//    }
//}
