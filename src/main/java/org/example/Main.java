package org.example;

import org.example.operations.RecurringSymbolsFinder;

public class Main {
    public static void main(String[] args) {
        RecurringSymbolsFinder finder = new RecurringSymbolsFinder();
        finder.outputRecurringSymbols(finder.findRecurringSymbols("after avtor"));
    }
}