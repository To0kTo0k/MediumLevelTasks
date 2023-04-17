package org.example.handler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUnrecurringSymbolsFinderTest {

    FirstUnrecurringSymbolFinder finder = new FirstUnrecurringSymbolFinder();

    @Test
    void firstUnrecurringSymbolFromNullTest() {
        assertEquals(Character.MIN_VALUE, finder.findFirstUnrecurringSymbol(null));
    }

    @Test
    void firstUnrecurringSymbolFromEmptyTest() {
        assertEquals(Character.MIN_VALUE, finder.findFirstUnrecurringSymbol(""));
    }

    @Test
    void firstUnrecurringSymbolFromOnlyRecurringSymbolsStringTest() {
        assertEquals(Character.MIN_VALUE, finder.findFirstUnrecurringSymbol("aa"));
    }

    @Test
    void firstUnrecurringSymbolTest() {
        Character expectedSymbol = 'c';
        assertEquals(expectedSymbol, finder.findFirstUnrecurringSymbol("abcab"));
    }
}
