package org.example.operations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RecurringSymbolsFinderTest {

    @org.junit.jupiter.api.Test
    void outputRecurringSymbols() {
        RecurringSymbolsFinder finder = new RecurringSymbolsFinder();
        Map<Character, Integer> reccuringSymbols = finder.findRecurringSymbols(" ");
        Map<Character, Integer> expectedSymbols = new HashMap<>();
        assertEquals(expectedSymbols, reccuringSymbols);
    }
}