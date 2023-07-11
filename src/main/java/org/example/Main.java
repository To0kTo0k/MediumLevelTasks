package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(PersonCreator.createPerson(10));
        }
        AddressOfPersonOperations operations = new AddressOfPersonOperations();
        operations.printAddressesOfPersons(persons);
    }
}