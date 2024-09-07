package com.DSA.Stack.StackQuestions.LeetCodeQuestion;

class minimumInsertion {
    public int minInsertions(String s) {
        int leftNeeded = 0;
        int insertions = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                leftNeeded++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    insertions++;
                }
                if (leftNeeded > 0) {
                    leftNeeded--;
                } else {
                    insertions++;
                }
            }
            i++;
        }

        insertions += 2 * leftNeeded;
        return insertions;
        
    }
}