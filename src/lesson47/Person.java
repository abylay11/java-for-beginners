package lesson47;

import java.io.Serializable;

public class Person implements Serializable {
    private final transient int id;
    private final transient String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
