package org.example.handler;

import java.util.Arrays;

public class FirstUnrecurringSymbolFinder {
    public Character findFirstUnrecurringSymbol(String symbolLine) {
        if (symbolLine == null || symbolLine.isEmpty()) {
            return Character.MIN_VALUE;
        }
        int[] array = new int[123];
        Arrays.fill(array, 0);
        for (char symbol : symbolLine.toCharArray()) {
            array[symbol]++;
        }
        return symbolLine.chars()
                .mapToObj(s -> (char) s)
                .filter(symbol -> array[symbol] == 1)
                .findFirst().orElse(Character.MIN_VALUE);
    }
}
