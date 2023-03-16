package org.example.entity;

public class BoardSolution {
    /**
     * Матрица должна быть валидна в соответствии с правилами:
     * 1) Каждая строка должна содержать цифры от 1 до 9 без повторений
     * 2) Каждая колонка должна содержать цифры от 1 до 9 без повторений
     * 3) Матрица может быть частично заполнена, пустые ячейки содержат "."
     * 4) Значение ячейки валидно, если это цифра от 1 до 9 или .
     * 5) Наличие букв в качестве значений недопустимо
     **/
    public static boolean isValidBoard(char[][] board) {
        if (!isValidSymbols(board))
            return false;
        if (!isValidRows(board))
            return false;
        return isValidColumns(board);
    }

    /**
     * Проверка строк на уникальные цифровые значения
     **/
    public static boolean isValidRows(char[][] board) {
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                for (int k = j + 1; k < board.length; k++) {
                    if (chars[j] == chars[k] && chars[j] != '.')
                        return false;
                }
            }
        }
        return true;
    }

    /**
     * Проверка столбцов на уникальные значения
     **/
    public static boolean isValidColumns(char[][] board) {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board.length; j++) {
                for (int k=j+1; k< board.length; k++) {
                    if (board[j][i] == board[k][i] && board[j][i] != '.') {
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
    public static boolean isValidSymbols(char[][] board) {
        char[] symbols = {'1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' , '.'};
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                boolean flag = false;
                for (char symbol : symbols) {
                    if (symbol == chars[j]) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    return false;
            }
        }
        return true;
    }
}
