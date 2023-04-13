package org.example.handler;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUnrecurringSymbolFinder {
    public Character findFirstUnrecurringSymbol(String symbolLine) {
        if (symbolLine == null || symbolLine.isEmpty()) {
            return null;
        }
        Map<Character, Integer> symbolsFrequency = symbolLine.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt((number -> 1))));
        return symbolLine.chars()
                .mapToObj(symbol -> (char) symbol)
                .filter(symbol -> symbolsFrequency.get(symbol) == 1)
                .findFirst().orElse(null);
    }
}
