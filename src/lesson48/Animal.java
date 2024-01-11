package lesson48;

public enum Animal {
    DOG("Собака"),
    CAT("Кошка"),
    FROG("Лягушка");

    private String translation;

    Animal() {

    }

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Перевод на русский язык " + translation;
    }
}
