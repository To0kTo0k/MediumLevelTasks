package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SumOfNumbersInListOperations operations = new SumOfNumbersInListOperations();

        System.out.println("Input number of numbers in list:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Input numbers in list:");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println("Sum of positive elements in list: " + operations.sumOfPositiveNumbersInList(Arrays.stream(values).boxed().toList()));
        System.out.println("Sum of negative elements in list: " + operations.sumOfNegativeNumbersInList(Arrays.stream(values).boxed().toList()));
    }
}