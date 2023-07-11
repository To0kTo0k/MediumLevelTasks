package org.example;

import java.util.List;

public class SumOfNumbersInListOperations {
    public int sumOfPositiveNumbersInList(List<Integer> list) {
        return list.stream().map(x -> x < 0 ? 0 : x).reduce(Integer::sum).orElse(0);
    }

    public int sumOfNegativeNumbersInList(List<Integer> list) {
        return list.stream().map(x -> x > 0 ? 0 : x).reduce(Integer::sum).orElse(0);
    }
}
