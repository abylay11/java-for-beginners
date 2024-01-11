package lesson48;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal.getTranslation());
        System.out.println(animal);

        // Object -> Enum -> Season
        Season season = Season.SUMMER;

        System.out.println(season.getTemperature());

        System.out.println(season instanceof Enum);
        System.out.println(season.getClass());

        switch (season) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }

        //

        Season season1 = Season.AUTUMN;
        System.out.println(season1.name());

        Animal animal1 = Animal.CAT;
        System.out.println(animal1.name());

        System.out.println(Animal.valueOf("CAT"));

        System.out.println(animal1.ordinal());
    }
}
