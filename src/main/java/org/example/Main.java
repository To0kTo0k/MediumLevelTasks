package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedListReversingOperations operations = new LinkedListReversingOperations();

        System.out.println("Input number of elements in linked list:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Input elements of linked list:");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }

        Node node = operations.init(values);
        System.out.println("Output linked list:");
        operations.print(node);

        node = operations.reverse(node);
        System.out.println();
        System.out.println("Output reversed linked list:");
        operations.print(node);
    }
}