package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TreeOperations operations = new TreeOperations();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of tree elements:");
        int number = scanner.nextInt();
        System.out.println("Input array of int values:");
        int [] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        Node tree = operations.init(values);
        System.out.println("Preorder tree traversal:\n" + operations.searchNLR(tree) + "\n");
        System.out.println("Inorder tree traversal:\n" + operations.searchLNR(tree) + "\n");
        System.out.println("Postorder tree traversal:\n" + operations.searchLRN(tree) + "\n");
        System.out.println("Breadth-first traversal:\n" + operations.searchBFS(tree) + "\n");
    }
}