package ru.pogodaev.leetcode.n680;

/**
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 * */

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(validPalindrome("cbbcc"));
    }

     public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, ++left, right) || isPalindrome(s, left, --right);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else return false;
        }
        return true;
    }
}
