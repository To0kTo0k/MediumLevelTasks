package org.example.handler;

// определить, что одна строка является анаграммой лругой
// (состоит из тех же букв)
public class AnagramCheckOperation {
    public boolean isAnagram(String first, String second) {
        if (first == null || first.isEmpty() || second == null || second.isEmpty()) {
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
