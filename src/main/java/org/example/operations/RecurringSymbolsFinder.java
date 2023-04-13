package org.example.operations;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RecurringSymbolsFinder {
    public Map<Character, Integer> findRecurringSymbols(String symbolLine) {
        if (symbolLine == null || symbolLine.isEmpty()) {
            return new HashMap<>();
        }
        return symbolLine.chars()
                .mapToObj(symbol -> (char) symbol)
                .collect(Collectors.groupingBy(symbol -> symbol, Collectors.summingInt(number -> 1)));
    }

    public void outputRecurringSymbols(Map<Character, Integer> recurringSymbols) {
        recurringSymbols.forEach((key, value) -> System.out.println("\"" + key + "\" : " + value));
    }
}
