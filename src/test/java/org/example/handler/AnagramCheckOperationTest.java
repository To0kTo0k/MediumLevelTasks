package org.example.handler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramCheckOperationTest {

    AnagramCheckOperation anagramCheckOperation = new AnagramCheckOperation();

    @Test
    void isAnagramEmpty() {
        assertEquals(false, (anagramCheckOperation.isAnagram("", "")));
    }
}