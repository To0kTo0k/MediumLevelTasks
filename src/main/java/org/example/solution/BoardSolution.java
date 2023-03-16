package org.example.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BoardSolution {
    public static final Set<Character> SET_SYMBOLS = Collections.unmodifiableSet(new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '.')));

    /**
     * Матрица должна быть валидна в соответствии с правилами:
     * 1) Каждая строка должна содержать цифры от 1 до 9 без повторений
     * 2) Каждая колонка должна содержать цифры от 1 до 9 без повторений
     * 3) Матрица может быть частично заполнена, пустые ячейки содержат "."
     * 4) Значение ячейки валидно, если это цифра от 1 до 9 или .
     * 5) Наличие букв в качестве значений недопустимо
     **/
    public static void isValidBoard(char[][] board) {
        if (isValidRowsAndColumns(board) && isValidSymbols(board)) {
            System.out.println("Matrix is valid");
        } else {
            System.out.println("Matrix is not valid");
        }
    }

    /**
     * Проверка строк и столбцов на уникальные цифровые значения
     **/
    private static boolean isValidRowsAndColumns(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> uniqueRow = new HashSet<>();
            Set<Character> uniqueColumn = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (!addUniqueToSet(i, j, board, uniqueRow)) {
                    return false;
                };
                if (!addUniqueToSet(j, i, board, uniqueColumn)) {
                    return false;
                };
            }
        }
        return true;
    }

    private static boolean addUniqueToSet(int i, int j, char[][] board, Set<Character> uniqueSet) {
        if (!uniqueSet.contains(board[i][j])) {
            uniqueSet.add(board[i][j]);
            return true;
        }
        return board[i][j] == '.';
    }

    /**
     * Проверка на валидность символов
     **/
    private static boolean isValidSymbols(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (!SET_SYMBOLS.contains(board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
