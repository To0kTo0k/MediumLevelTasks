package org.example.operations;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecurringSymbolsFinderTest {

    RecurringSymbolsFinder finder = new RecurringSymbolsFinder();

    @Test
    void findRecurringSymbolsTest() {
        Map<Character, Integer> expectedSymbols = new HashMap<>();
        expectedSymbols.put('a', 3);
        expectedSymbols.put('b', 1);
        expectedSymbols.put(' ', 1);
        assertEquals(expectedSymbols, finder.findRecurringSymbols("aa ab"));
    }

    @Test
    void findDifferentCaseSymbolsTest() {
        Map<Character, Integer> recurringSymbols = finder.findRecurringSymbols("Aa");
        int expectedSymbolsNumber = 1;
        int realSmallSymbolsNumber = recurringSymbols.get('a');
        int realBigSymbolsNumber = recurringSymbols.get('A');
        assertEquals(expectedSymbolsNumber, realSmallSymbolsNumber);
        assertEquals(expectedSymbolsNumber, realBigSymbolsNumber);
    }

    @Test
    void findSymbolsFromNullTest() {
        assertEquals(0, finder.findRecurringSymbols(null).size());
    }

    @Test
    void findSymbolsFromEmptyTest() {
        assertEquals(0, finder.findRecurringSymbols("").size());
    }
}