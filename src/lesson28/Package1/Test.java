package lesson28.Package1;

public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        person.defaultName = "Jon";
        System.out.println(person.defaultName);
        System.out.println(person.protectedString);
    }

}
