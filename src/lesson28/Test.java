package lesson28;

import lesson28.Package1.Person;

public class Test {
    public static void main(String[] args) {
        // public, private, default, protected
        // default - все что default доступно в пределах этого пакета
        // protected - доступны в пределах одного пакета, доступно всем подклассам, даже если эти подклассы
        // вне пакета
        Person person1 = new Person();
        person1.publicName = "David";
        System.out.println(person1.publicName);
        System.out.println(Person.CONSTANT);

    }

}
