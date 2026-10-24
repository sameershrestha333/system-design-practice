package lld.oop.after;

public class User {
    // private fields
    private String name;
    private int age;

    // validation on age and name
    public User(String name, int age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, " + name);
    }

}

