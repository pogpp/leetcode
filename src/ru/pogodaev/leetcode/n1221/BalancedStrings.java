package ru.pogodaev.leetcode.n1221;

public class BalancedStrings {

    public int balancedStringSplit(String s) {
        int result = 0;
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') counter++;
            if (c == 'R') counter--;
            if (counter == 0) result++;
        }
        return result;
    }
}
