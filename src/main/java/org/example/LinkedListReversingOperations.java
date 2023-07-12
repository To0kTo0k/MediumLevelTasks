package org.example;

public class LinkedListReversingOperations {

    public Node init(int[] values) {
        if (values.length == 0) {
            return null;
        }
        Node node = new Node(null, values[values.length - 1]);
        return initIteration(node, setValues(values));
    }

    private Node initIteration(Node node, int[] values) {
        if (values.length > 0) {
            Node newNode = new Node(node, values[values.length - 1]);
            return initIteration(newNode, setValues(values));
        } else {
            return node;
        }
    }

    private int[] setValues(int[] values) {
        int[] newValues = new int[values.length - 1];
        System.arraycopy(values, 0, newValues, 0, newValues.length);
        return newValues;
    }

    public Node reverse(Node node) {
        Node previous = null;
        Node current = node;
        while (current != null) {
            Node next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

    public void print(Node node) {
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
    }
}
