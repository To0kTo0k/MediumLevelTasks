package org.example.handler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FirstUnrecurringSymbolsFinderTest {

    FirstUnrecurringSymbolFinder finder = new FirstUnrecurringSymbolFinder();

    @Test
    void firstUnrecurringSymbolFromNullTest() {
        assertNull(finder.findFirstUnrecurringSymbol(null));
    }

    @Test
    void firstUnrecurringSymbolFromEmptyTest() {
        assertNull(finder.findFirstUnrecurringSymbol(""));
    }

    @Test
    void firstUnrecurringSymbolFromOnlyRecurringSymbolsStringTest() {
        assertNull(finder.findFirstUnrecurringSymbol("aa"));
    }

    @Test
    void firstUnrecurringSymbolTest() {
        Character expectedSymbol = 'c';
        assertEquals(expectedSymbol, finder.findFirstUnrecurringSymbol("abcab"));
    }
}
