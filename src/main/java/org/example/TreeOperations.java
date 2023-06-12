package org.example;

import java.util.ArrayList;
import java.util.List;

public class TreeOperations {

    /**
     * Tree initiation
     */
    public Node init(int[] values) {
        if (values == null) {
            return null;
        }
        Node subtree = new Node(values[0]);
        int[] rightValues;
        int[] leftValues = new int[values.length / 2];
        System.arraycopy(values, 1, leftValues, 0, values.length / 2);
        if (values.length % 2 == 0) {
            rightValues = new int[values.length / 2 - 1];
            System.arraycopy(values, values.length / 2 + 1, rightValues, 0, values.length / 2 - 1);
        } else {
            rightValues = new int[values.length / 2];
            System.arraycopy(values, values.length / 2 + 1, rightValues, 0, values.length / 2);
        }
        if (values.length >= 2) {
            subtree.setLeft(init(leftValues));
        }
        if (values.length >= 3) {
            subtree.setRight(init(rightValues));
        }
        return subtree;
    }

    /**
     * Preorder tree search
     */
    public String searchNLR(Node tree) {
        if (tree == null) {
            return "";
        }
        return tree.getValue() + " " +
                searchNLR(tree.getLeft()) +
                searchNLR(tree.getRight());
    }

    /**
     * Inorder tree search
     */
    public String searchLNR(Node tree) {
        if (tree == null) {
            return "";
        }
        return searchLNR(tree.getLeft()) +
                tree.getValue() + " " +
                rightSideLNR(tree.getRight());
    }

    private String rightSideLNR(Node tree) {
        if (tree == null) {
            return "";
        }
        return tree.getValue() + " " +
                searchLNR(tree.getLeft()) +
                rightSideLNR(tree.getRight());
    }

    /**
     * Postorder tree search
     */
    public String searchLRN(Node tree) {
        if (tree == null) {
            return "";
        }
        return searchLRN(tree.getLeft()) +
                searchLRN(tree.getRight()) +
                tree.getValue() + " ";
    }

    /**
     * Breadth-first search
     */
    public String searchBFS(Node tree) {
        if (tree == null) {
            return "";
        }
        List<Node> nodes = new ArrayList<>();
        nodes.add(tree);
        return levelBFS(nodes);
    }

    private String levelBFS(List<Node> nodes) {
        if (nodes.isEmpty()) {
            return "";
        }
        List<Node> newNodes = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (Node n : nodes) {
            builder.append(n.getValue()).append(" ");
            if (n.getLeft() != null) {
                newNodes.add(n.getLeft());
            }
            if (n.getRight() != null) {
                newNodes.add(n.getRight());
            }
        }
        builder.append(levelBFS(newNodes));
        return builder.toString();
    }
}
