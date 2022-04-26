package com.company;

public class Person {
    private String name;
    private int age;
    private String address;

    Person(){
        this.name = "Ashton Cox";
        this.age = 47;
        this.address = "Roseville NH 11523";
    }
    public void printPerson() {
        System.out.println("Name: " + this.name + " \nAge: " + this.age + " years \nAddress: " + this.address);
    }
}
