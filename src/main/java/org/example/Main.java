package org.example;

import org.example.handler.FirstUnrecurringSymbolFinder;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String symbolLine = randomString();

        System.out.println(symbolLine);
        FirstUnrecurringSymbolFinder finder = new FirstUnrecurringSymbolFinder();
        long start = System.currentTimeMillis();
        char symbol = finder.findFirstUnrecurringSymbol(symbolLine);
        long finish = System.currentTimeMillis();
        System.out.println("\"" + symbol + "\" за время в " + (finish - start) + " миллисекунд");
    }

    public static String randomString() {
        int leftLimit = 66; // numeral 'B'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 999999;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i >= 66) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        generatedString = generatedString + 'A';
        return generatedString;
    }
}