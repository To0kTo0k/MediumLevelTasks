package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryFindOperationsTest {

    BinaryFindOperations operations = new BinaryFindOperations();

    @Test
    void findExistingNonMiddleNumberInArray() {
        assertEquals(0, operations.findNumberInArray(new int[]{0, 1, 2, 3, 4, 5, 6}, 0));
    }

    @Test
    void findNonExistingNumberInArray() {
        assertEquals(-1, operations.findNumberInArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 8));
    }

    @Test
    void findNumberInEmptyArray() {
        assertEquals(-1, operations.findNumberInArray(new int[10], 1));
    }

    @Test
    void findNumberInNonSortedArray() {
        assertEquals(-1, operations.findNumberInArray(new int[]{7, 6, 5, 4, 3, 2}, 7));
    }
}