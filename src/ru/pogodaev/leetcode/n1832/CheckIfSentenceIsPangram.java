package ru.pogodaev.leetcode.n1832;


import java.util.HashSet;
import java.util.Set;

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 */
public class CheckIfSentenceIsPangram {
    public static void main(String[] args) {
        String ex1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(ex1));
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            set.add(c);
        }

        return set.size() == 26;
    }
}
