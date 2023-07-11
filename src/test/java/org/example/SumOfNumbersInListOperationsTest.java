package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfNumbersInListOperationsTest {

    SumOfNumbersInListOperations operations = new SumOfNumbersInListOperations();

    @Test
    void sumOfPositiveNumbersWithNoPositiveElements() {
        assertEquals(0, operations.sumOfPositiveNumbersInList(List.of(-1, -2, -3, -4)));
    }

    @Test
    void sumOfPositiveElements() {
        assertEquals(10, operations.sumOfPositiveNumbersInList(List.of(1, 2, 3, 4, -1, -2)));
    }

    @Test
    void sumOfNegativeNumbersWithNoNegativeElements() {
        assertEquals(0, operations.sumOfNegativeNumbersInList(List.of(1, 2, 3, 4)));
    }

    @Test
    void sumOfNegativeElements() {
        assertEquals(-10, operations.sumOfNegativeNumbersInList(List.of(-1, -2, -3, -4, 1, 2)));
    }
}