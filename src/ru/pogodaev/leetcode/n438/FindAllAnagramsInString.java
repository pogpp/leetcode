package ru.pogodaev.leetcode.n438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 * You may return the answer in any order.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 */
public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println();
        for (int m : findAnagrams(s, p)) {
            System.out.print(m);
            System.out.print(" ");
        }
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        HashMap<Character, Integer> pCount = new HashMap<>();
        HashMap<Character, Integer> sCount = new HashMap<>();

        for (char c : p.toCharArray()) {
            pCount.put(c, pCount.getOrDefault(c, 0) + 1);
        }

        int windowSize = p.length();
        for (int i = 0; i < windowSize; i++) {
            char c = s.charAt(i);
            sCount.put(c, sCount.getOrDefault(c, 0) + 1);
        }

        if (sCount.equals(pCount)) {
            result.add(0);
        }

        for (int i = windowSize; i < s.length(); i++) {
            char newChar = s.charAt(i);
            sCount.put(newChar, sCount.getOrDefault(newChar, 0) + 1);

            char oldChar = s.charAt(i - windowSize);
            sCount.put(oldChar, sCount.get(oldChar) - 1);
            if (sCount.get(oldChar) == 0) {
                sCount.remove(oldChar);
            }

            if (sCount.equals(pCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }


}
