package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressOfPersonOperationsTest {
    AddressOfPersonOperations operations = new AddressOfPersonOperations();

    @Test
    void getAddressesOfPersons() {
        List<Person> persons = Arrays.asList(
                new Person(15, "abcd"),
                new Person(),
                new Person(15, null));
        assertEquals("abcd", operations.getAddressesOfPersons(persons).get(0));
    }
}