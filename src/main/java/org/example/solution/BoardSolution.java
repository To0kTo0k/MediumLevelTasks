package org.example.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BoardSolution {
    private static final Character[] SYMBOLS = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
    public static final Set<Character> SET_SYMBOLS = new HashSet<>(Arrays.asList(SYMBOLS));

    /**
     * Матрица должна быть валидна в соответствии с правилами:
     * 1) Каждая строка должна содержать цифры от 1 до 9 без повторений
     * 2) Каждая колонка должна содержать цифры от 1 до 9 без повторений
     * 3) Матрица может быть частично заполнена, пустые ячейки содержат "."
     * 4) Значение ячейки валидно, если это цифра от 1 до 9 или .
     * 5) Наличие букв в качестве значений недопустимо
     **/
    public static boolean isValidBoard() {
        char[][] board =
                {{'5', '3', '.', 'a', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        return isValidSymbols(board) && isValidRowsAndColumns(board);
    }

    /**
     * Проверка строк и столбцов на уникальные цифровые значения
     **/
    private static boolean isValidRowsAndColumns(char[][] board) {
        for (int k = 0; k < board.length; k++) {
            for (int i = 0; i < board.length - 1; i++) {
                for (int j = i + 1; j < board.length; j++) {
                    if ((board[k][i] == board[k][j] && board[k][i] != '.') || (board[i][k] == board[j][k] && board[i][k] != '.')) {
                        System.out.println("There are similar symbols in [" + k + ", " + i + "] and [" + k + ", " + j + "] or/and in [" + i + ", " + k + "] and [" + j + ", " + k + "]");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Проверка на валидность символов
     **/
    private static boolean isValidSymbols(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (!SET_SYMBOLS.contains(board[i][j])) {
                    System.out.println("Invalid symbol in position [" + i + ", " + j + "]: " + board[i][j]);
                    return false;
                }
            }
        }
        return true;
    }
}
