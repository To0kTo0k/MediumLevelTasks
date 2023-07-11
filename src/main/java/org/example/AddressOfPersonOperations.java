package org.example;

import java.util.List;
import java.util.Objects;

public class AddressOfPersonOperations {
    public void printAddressesOfPersons(List<Person> persons) {
        persons.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getAge() > 14)
                .map(Person::getAddress)
                .filter(Objects::nonNull)
                .distinct()
                .forEach(System.out::println);
    }

    public List<String> getAddressesOfPersons(List<Person> persons) {
        return persons.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getAge() > 14)
                .map(Person::getAddress)
                .filter(Objects::nonNull)
                .distinct()
                .toList();
    }
}
