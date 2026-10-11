package uk.ac.westminster.products_api;


public class Person {

    private String name;

    private String email;

    public Person() {
    }

    public Person(String name) {   // Constructor class
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // TODO (Activity 3): add the "email" field and its getter here.
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
