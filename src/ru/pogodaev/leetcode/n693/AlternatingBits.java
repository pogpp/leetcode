package ru.pogodaev.leetcode.n693;

public class AlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        char[] arr = binary.toCharArray();
        for (int i = 1; i < binary.length(); i++) {
            if (arr[i - 1] == arr[i]) return false;
        }
        return true;
    }
}
