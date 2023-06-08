package org.example.handler;

public class AnagramCheckOperation {
    public boolean isAnagram(String first, String second) {
        if (first == null || second == null) {
            return false;
        }
        for (char symbol : first.toCharArray()) {
            if (!second.contains(String.valueOf(symbol))) {
                return false;
            }
        }
        return true;
    }
}
