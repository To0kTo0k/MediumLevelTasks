package org.example.operations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RecurringSymbolsFinderTest {

    @Test
    void findRecurringSymbolsTest() {
        RecurringSymbolsFinder finder = new RecurringSymbolsFinder();
        Map<Character, Integer> recurringSymbols = finder.findRecurringSymbols("aa ab");
        Map<Character, Integer> expectedSymbols = new HashMap<>();
        expectedSymbols.put('a', 3);
        expectedSymbols.put('b', 1);
        expectedSymbols.put(' ', 1);
        assertEquals(expectedSymbols, recurringSymbols);
    }

    @Test
    void findDifferentCaseSymbolsTest() {
        RecurringSymbolsFinder finder = new RecurringSymbolsFinder();
        Map<Character, Integer> recurringSymbols = finder.findRecurringSymbols("Aa");
        int expectedSymbolsNumber = 1;
        int realSmallSymbolsNumber = recurringSymbols.get('a');
        int realBigSymbolsNumber = recurringSymbols.get('A');
        assertEquals(expectedSymbolsNumber, realSmallSymbolsNumber);
        assertEquals(expectedSymbolsNumber, realBigSymbolsNumber);
    }

    @Test
    void findSymbolsFromNullTest() {
        RecurringSymbolsFinder finder = new RecurringSymbolsFinder();
        Map<Character, Integer> recurringSymbols = finder.findRecurringSymbols(null);
        Map<Character, Integer> expectedSymbols = new HashMap<>();
        assertEquals(expectedSymbols, recurringSymbols);
    }
}