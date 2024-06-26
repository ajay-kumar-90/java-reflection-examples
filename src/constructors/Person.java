package constructors;

import java.util.StringJoiner;

public class Person {
    private final Address address;
    private final String name;
    private final int age;

    public Person(Address address, String name, int age) {
        this.address = address;
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = null;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = null;
    }

    public Person() {
        this.name = "anonymous";
        this.age = 0;
        this.address = null;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("address=" + address)
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}
