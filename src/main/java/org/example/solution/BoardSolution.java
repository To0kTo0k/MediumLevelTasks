package org.example.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BoardSolution {
    public static final Set<Character> SET_SYMBOLS = new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '.'));

    public static char[][] getMatrix() {
        return new char[][]
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
    }

    /**
     * Матрица должна быть валидна в соответствии с правилами:
     * 1) Каждая строка должна содержать цифры от 1 до 9 без повторений
     * 2) Каждая колонка должна содержать цифры от 1 до 9 без повторений
     * 3) Матрица может быть частично заполнена, пустые ячейки содержат "."
     * 4) Значение ячейки валидно, если это цифра от 1 до 9 или .
     * 5) Наличие букв в качестве значений недопустимо
     **/
    public static void isValidBoard() {
        if (isValidRowsAndColumns(getMatrix()) && isValidSymbols(getMatrix())) {
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
            for (int j = 1; j < board.length; j++) {
                if (board[i][j] != '.' && !uniqueRow.contains(board[i][j])) {
                    uniqueRow.add(board[i][j]);
                } else {
                    if (board[i][j] != '.') {
                        return false;
                    }
                }
                if (board[j][i] != '.' && !uniqueColumn.contains(board[j][i])) {
                    uniqueColumn.add(board[j][i]);
                } else {
                    if (board[j][i] != '.') {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //    private static boolean isValidRowsAndColumns(char[][] board) {
//        for (int k = 0; k < board.length; k++) {
//            for (int i = 0; i < board.length - 1; i++) {
//                for (int j = i + 1; j < board.length; j++) {
//                    if ((board[k][i] == board[k][j] && board[k][i] != '.') || (board[i][k] == board[j][k] && board[i][k] != '.')) {
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
//    }

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
