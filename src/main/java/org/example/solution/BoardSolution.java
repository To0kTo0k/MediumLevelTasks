package org.example.solution;

import java.util.*;

public class BoardSolution {
    private static final Set<Character> SET_SYMBOLS = Set.of('1', '2', '3', '4', '5', '6', '7', '8', '9', '.');
    private static final int BOARDSIZE = 9;

    /**
     * Матрица должна быть валидна в соответствии с правилами:
     * 1) Каждая строка должна содержать цифры от 1 до 9 без повторений
     * 2) Каждая колонка должна содержать цифры от 1 до 9 без повторений
     * 3) Матрица может быть частично заполнена, пустые ячейки содержат "."
     * 4) Значение ячейки валидно, если это цифра от 1 до 9 или .
     * 5) Наличие букв в качестве значений недопустимо
     **/
    public void isValidBoard(char[][] board) {
        if (isValidRowsAndColumns(board) && isValidSymbols(board) && isValidBlocks(board) && isValidSize(board)) {
            System.out.println("Matrix is valid");

        } else {
            System.out.println("Matrix is not valid");
        }
    }

    /**
     * Проверка размера матрицы
     *
     * @return - true, если размер матрицы корректный, иначе false
     **/
    protected boolean isValidSize(char[][] board) {
        if (board == null) {
            return false;
        }
        return board.length == BOARDSIZE;
    }

    /**
     * Проверка на валидность элементов матрицы
     *
     * @return - false, если присутствует невалидный элемент, иначе true
     **/
    protected boolean isValidSymbols(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (!SET_SYMBOLS.contains(board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Проверка строк и столбцов на уникальные цифровые значения
     **/
    protected boolean isValidRowsAndColumns(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> uniqueRow = new HashSet<>();
            Set<Character> uniqueColumn = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (addUniqueToSet(i, j, board, uniqueRow)) {
                    return false;
                }
                if (addUniqueToSet(j, i, board, uniqueColumn)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Проверка блоков 3 на 3 на валидность
     *
     * @return - false, если есть хоть один невалидный блок, иначе true
     **/
    protected boolean isValidBlocks(char[][] board) {
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j += 3) {
                if (!isValidBlock(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Проверка блока 3 на 3 на валидность
     *
     * @return - false, если в блоке есть повторяющиеся элементы (кроме "."), иначе true
     **/
    protected boolean isValidBlock(char[][] board, int i, int j) {
        Set<Character> uniqueBlock = new HashSet<>();
        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                if (addUniqueToSet(k, l, board, uniqueBlock)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Проверка на наличие элемента матрицы в наборе
     *
     * @return - false, если элемент присутствует в наборе, иначе true
     **/
    protected boolean addUniqueToSet(int i, int j, char[][] board, Set<Character> uniqueSet) {
        if (!uniqueSet.contains(board[i][j])) {
            uniqueSet.add(board[i][j]);
            return false;
        }
        return board[i][j] != '.';
    }
}
