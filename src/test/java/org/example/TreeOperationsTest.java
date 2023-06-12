package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TreeOperationsTest {

    TreeOperations operations = new TreeOperations();

    @Test
    void initUnevenValues() {
        Node tree = operations.init(new int[] {1, 2, 3, 4, 5});
        assertEquals(1, tree.getValue());
        assertEquals(2, tree.getLeft().getValue());
        assertEquals(3, tree.getLeft().getLeft().getValue());
        assertEquals(4, tree.getRight().getValue());
        assertEquals(5, tree.getRight().getLeft().getValue());
    }

    @Test
    void initEvenValues() {
        Node tree = operations.init(new int[] {1, 2, 3, 4});
        assertEquals(1, tree.getValue());
        assertEquals(2, tree.getLeft().getValue());
        assertEquals(3, tree.getLeft().getLeft().getValue());
        assertEquals(4, tree.getRight().getValue());
    }

    @Test
    void initOneElem() {
        Node tree = operations.init(new int[] {1});
        assertEquals(1, tree.getValue());
        assertNull(tree.getLeft());
        assertNull(tree.getRight());
    }

    @Test
    void initNoElems() {
        Node tree = operations.init(null);
        assertNull(tree);
    }

    @Test
    void searchNLR() {
        Node tree = operations.init(new int[] {1, 2, 3, 4, 5});
        assertEquals("1 2 3 4 5", operations.searchNLR(tree).trim());
    }

    @Test
    void searchLNR() {
        Node tree = operations.init(new int[] {1, 2, 3, 4, 5, 6, 7});
        assertEquals("3 2 4 1 5 6 7", operations.searchLNR(tree).trim());
    }

    @Test
    void searchLRN() {
        Node tree = operations.init(new int[] {1, 2, 3, 4, 5, 6, 7});
        assertEquals("3 4 2 6 7 5 1", operations.searchLRN(tree).trim());
    }

    @Test
    void searchBFS() {
        Node tree = operations.init(new int[] {1, 2, 3, 4, 5, 6, 7});
        assertEquals("1 2 5 3 4 6 7", operations.searchBFS(tree).trim());
    }
}