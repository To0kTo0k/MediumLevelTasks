package org.example.operations;

import java.util.HashMap;
import java.util.Map;

public class RecurringSymbolsFinder {
    public Map<Character, Integer> findRecurringSymbols(String symbolLine) {
        Map<Character, Integer> passedSymbols = new HashMap<>();
        try {
            for (int numberInLine = 0; numberInLine < symbolLine.length(); numberInLine++) {
                if (passedSymbols.containsKey(symbolLine.charAt(numberInLine))) {
                    int symbolRepetitionNumber = passedSymbols.get(symbolLine.charAt(numberInLine));
                    symbolRepetitionNumber++;
                    passedSymbols.put(symbolLine.charAt(numberInLine), symbolRepetitionNumber);
                } else {
                    passedSymbols.put(symbolLine.charAt(numberInLine), 1);
                }
            }
        }
        catch (NullPointerException e) {
            throw new RuntimeException("Input argument is null", e.getCause());
        }
        return passedSymbols;
    }

    public void outputRecurringSymbols(Map<Character, Integer> recurringSymbols) {
        for (Map.Entry<Character, Integer> entry : recurringSymbols.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" : " + entry.getValue());
        }
    }
}
