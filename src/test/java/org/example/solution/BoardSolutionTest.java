package org.example.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BoardSolutionTest {

    BoardSolution operation = new BoardSolution();

    char[][] board = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
            , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
            , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
            , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
            , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
            , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
            , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
            , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
            , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

    @Test
    void isValidSize() {
        assertTrue(operation.isValidSize(board));
    }

    @Test
    void isNoValidSize() {
        assertFalse(operation.isValidSize(new char[10][10]));
    }

    @Test
    void isNullIsValidSize() {
        assertFalse(operation.isValidSize(null));
    }

    @Test
    void isValidSymbols() {
        assertTrue(operation.isValidSymbols(board));
    }

    @Test
    void isNoValidSymbols() {
        board[0][0] = 'a';
        assertFalse(operation.isValidSymbols(board));
    }

    @Test
    void isValidRowsAndColumns() {
        assertTrue(operation.isValidRowsAndColumns(board));
    }

    @Test
    void isNoValidRow() {
        board[0][2] = '3';
        assertFalse(operation.isValidRowsAndColumns(board));
    }

    @Test
    void isNoValidColumn() {
        board[0][2] = '8';
        assertFalse(operation.isValidRowsAndColumns(board));
    }

    @Test
    void isValidBlocks() {
        assertTrue(operation.isValidBlocks(board));
    }

    @Test
    void isNoValidBlocks() {
        board[1][1] = '3';
        assertFalse(operation.isValidBlocks(board));
    }
}