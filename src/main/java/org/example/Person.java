package org.example;

public class Person {
    private int age;
    private String address;

    Person(int age) {
        if (age > 15) {
            throw new IllegalArgumentException("Age can`t be more than 15");
        }
        int randomAgeAddition = Double.valueOf(Math.random() * 10).intValue();
        int random = Double.valueOf(Math.random() * 10).intValue();
        this.age = age + randomAgeAddition;
        if (random > 5) {
            this.address = "Amazing street №" + random;
        }
    }

    Person(int age, String address) {
        this.age = age;
        this.address = address;
    }

    Person() {}

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
