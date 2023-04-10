package org.example.operations;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RecurringSymbolsFinderTest {

    @Test
    void findRecurringSymbolSymbolsTest() {
        RecurringSymbolsFinder finder = new RecurringSymbolsFinder();
        Map<Character, Integer> recurringSymbols = finder.findRecurringSymbols("");
        Map<Character, Integer> expectedSymbols = new HashMap<>();
        assertEquals(expectedSymbols, recurringSymbols);
    }
}