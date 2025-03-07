package ru.pogodaev.leetcode.n301;

import java.util.*;

/**
 * Given a string s that contains parentheses and letters,
 * remove the minimum number of invalid parentheses to make the input string valid.
 * <p>
 * Return a list of unique strings that are valid with the minimum number of removals.
 * You may return the answer in any order.
 * Example 1:
 * <p>
 * Input: s = "()())()"
 * Output: ["(())()","()()()"]
 * Example 2:
 * <p>
 * Input: s = "(a)())()"
 * Output: ["(a())()","(a)()()"]
 * Example 3:
 * <p>
 * Input: s = ")("
 * Output: [""]
 * <p>
 * 1 <= s.length <= 25
 * s consists of lowercase English letters and parentheses '(' and ')'.
 * There will be at most 20 parentheses in s.
 */
public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        var result = new ArrayList<String>();
        if (s == null) return result;

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (isValid(current)) {
                result.add(current);
                found = true;
            }

            if (found) continue; // If we've found a valid string, no need to generate more strings

            for (int i = 0; i < current.length(); i++) {
                if (current.charAt(i) == '(' || current.charAt(i) == ')') {
                    String nextStr = current.substring(0, i) + current.substring(i + 1);
                    if (!visited.contains(nextStr)) {
                        visited.add(nextStr);
                        queue.add(nextStr);
                    }
                }
            }
        }
        return result;
    }

    private boolean isValid(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') count++;
            if (c == ')') count--;
            if (count < 0) return false;
        }
        return count == 0;
    }

}
