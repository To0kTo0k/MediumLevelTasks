package org.example;

import org.example.handler.FirstUnrecurringSymbolFinder;

public class Main {
    public static void main(String[] args) {
        FirstUnrecurringSymbolFinder finder = new FirstUnrecurringSymbolFinder();
        System.out.println("\"" + finder.findFirstUnrecurringSymbol("ab abc") + "\"");
    }
}