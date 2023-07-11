package org.example.handler;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AnagramCheckOperation {
    public boolean isAnagram(String first, String second) {
        if (first == null || second == null) {
            return false;
        }
        Map<Character, Integer> firstLettersMap = findRecurringSymbols(first);
        Map<Character, Integer> secondLettersMap = findRecurringSymbols(second);

        for (Map.Entry<Character, Integer> entry : firstLettersMap.entrySet()) {
            if (secondLettersMap.containsKey(entry.getKey())) {
                if (!Objects.equals(secondLettersMap.get(entry.getKey()), entry.getValue())) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> findRecurringSymbols(String symbolLine) {
        if (symbolLine == null || symbolLine.isEmpty()) {
            return new HashMap<>();
        }
        return symbolLine.chars()
                .mapToObj(symbol -> (char) symbol)
                .collect(Collectors.groupingBy(symbol -> symbol, Collectors.summingInt(number -> 1)));
    }
}
