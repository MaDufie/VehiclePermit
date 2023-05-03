package io.turntabl.owner;

public class Person {
    private final String nationalID;

    public Person(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getNationalID() {
        return nationalID;
    }
}
