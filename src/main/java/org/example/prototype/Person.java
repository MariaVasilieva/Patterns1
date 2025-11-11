package org.example.prototype;

public class Person implements Cloneable {
    private String name;
    private int age;
    private Address address;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone();
        return cloned;
    }
    public Address getAddress() {
        return address;
    }
}
