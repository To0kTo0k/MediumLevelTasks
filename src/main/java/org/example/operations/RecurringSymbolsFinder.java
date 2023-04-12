package org.example.operations;

import java.util.HashMap;
import java.util.Map;

public class RecurringSymbolsFinder {
    public Map<Character, Integer> findRecurringSymbols(String symbolLine) {
        Map<Character, Integer> passedSymbols = new HashMap<>();
        if (symbolLine == null || symbolLine.isEmpty()) {
            return passedSymbols;
        }
        for (int numberInLine = 0; numberInLine < symbolLine.length(); numberInLine++) {
            passedSymbols.merge(symbolLine.charAt(numberInLine), 1, Integer::sum);
        }
        return passedSymbols;
    }

    public void outputRecurringSymbols(Map<Character, Integer> recurringSymbols) {
        for (Map.Entry<Character, Integer> entry : recurringSymbols.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" : " + entry.getValue());
        }
    }
}
