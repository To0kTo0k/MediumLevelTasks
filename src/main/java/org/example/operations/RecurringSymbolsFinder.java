package org.example.operations;

import java.util.HashSet;
import java.util.Set;

public class RecurringSymbolsFinder {
    public void outputRecurringSymbols(String symbolLine) {
        Set<Character> passedSymbols = new HashSet<>();
        for (int numberInLine = 0; numberInLine < symbolLine.length(); numberInLine++) {
            if (isRecurringSymbol(symbolLine, symbolLine.charAt(numberInLine))) {
                passedSymbols.add(symbolLine.charAt(numberInLine));
            }
        }
        for (Character passedSymbol : passedSymbols) {
            System.out.println(passedSymbol);
        }
    }

    private boolean isRecurringSymbol(String symbolLine, char checkedSymbol) {
        return symbolLine.lastIndexOf(checkedSymbol) != symbolLine.indexOf(checkedSymbol);
    }
}
