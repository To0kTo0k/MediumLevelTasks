package org.example;

import org.example.handler.AnagramCheckOperation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnagramCheckOperation operation = new AnagramCheckOperation();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first word:");
        String first = scanner.nextLine();
        System.out.println("Input second word:");
        String second = scanner.nextLine();
        if (operation.isAnagram(first, second)) {
            System.out.println("Second word is anagram of first word");
        } else {
            System.out.println("Second word isn't anagram of first word");
        }
    }
}