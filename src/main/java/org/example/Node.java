package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private Node left;
    private Node right;
    private final int value;

    public Node(int value) {
        this.value = value;
    }
}
