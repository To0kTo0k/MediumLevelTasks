package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LinkedListReversingOperationsTest {

    LinkedListReversingOperations operations = new LinkedListReversingOperations();

    @Test
    void reverseOneElement() {
        Node node = operations.init(new int[]{1});
        Node reverseNode = operations.init(new int[]{1});
        reverseNode = operations.reverse(reverseNode);
        assertEquals(node.getValue(), reverseNode.getValue());
        assertEquals(node.getNext(), reverseNode.getNext());
    }

    @Test
    void reverseNull() {
        Node node = operations.init(new int[0]);
        node = operations.reverse(node);
        assertNull(node);
    }

    @Test
    void reverse() {
        Node node = operations.init(new int[]{1, 2, 3});
        node = operations.reverse(node);
        assertEquals(3, node.getValue());
        assertEquals(2, node.getNext().getValue());
        assertEquals(1, node.getNext().getNext().getValue());
        assertNull(node.getNext().getNext().getNext());
    }
}