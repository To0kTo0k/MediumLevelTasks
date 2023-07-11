package org.example.handler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramCheckOperationTest {

    AnagramCheckOperation anagramCheckOperation = new AnagramCheckOperation();

    @Test
    void isAnagramEmpty() {
        assertTrue((anagramCheckOperation.isAnagram("", "")));
    }

    @Test
    void isAnagramNull() {
        assertFalse(anagramCheckOperation.isAnagram(null, null));
    }

    @Test
    void isAnagramEqualsStrings() {
        assertTrue(anagramCheckOperation.isAnagram("abcd", "abcd"));
    }

    @Test
    void isAnagramWithEqualsLetters() {
        assertFalse(anagramCheckOperation.isAnagram("abc", "abca"));
    }

    @Test
    void isAnagramWithDifferentLetters() {
        assertFalse(anagramCheckOperation.isAnagram("abc", "def"));
    }
}