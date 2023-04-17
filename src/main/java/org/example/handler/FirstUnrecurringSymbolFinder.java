package org.example.handler;

public class FirstUnrecurringSymbolFinder {
    public Character findFirstUnrecurringSymbol(String symbolLine) {
        if (symbolLine == null || symbolLine.isEmpty()) {
            return Character.MIN_VALUE;
        }
        int[] array = new int[123];
        for (char symbol : symbolLine.toCharArray()) {
            array[symbol]++;
        }
        for (char symbol : symbolLine.toCharArray()) {
            if (array[symbol] == 1) {
                return symbol;
            }
        }
        return Character.MIN_VALUE;
    }
}
