package org.example;

public class BinaryFindOperations {

    private int recursion(int[] array, int low, int high, int number) {
        int middle = (high + low) >> 1;
        if (high > low) {
            if (array[middle] > number) {
                return recursion(array, low, middle - 1, number);
            }
            if (array[middle] < number) {
                return recursion(array, middle + 1, high, number);
            }
            if (array[middle] == number) {
                return middle;
            }
        }
        return -1;
    }

    public int findNumberInArray(int[] array, int number) {
        if (array.length == 0) {
            return -1;
        }
        return recursion(array, 0, array.length - 1, number);
    }
}
