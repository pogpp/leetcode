package ru.pogodaev.leetcode.n14;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */


public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] example = new String[]{"atc", "ab", "ac", "dd"};
        String[] example2 = new String[]{"flower", "flow", "flight"};
        String[] example3 = new String[]{"a"};
        String[] example4 = new String[]{"abab", "aba", ""};
        String[] example5 = new String[]{"aac", "acab", "aa", "abba", "aa"};
        System.out.println(longestCommonPrefix(example5));
    }


    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        char[][] strings = new char[strs.length][];

        int i = 0;
        for (String s : strs) {
            if (s.length() == 0) {
                System.out.println("bad");
                return "";
            }
            strings[i] = strs[i].toCharArray();
            i++;
        }


        for (int j = 0; j < strings[0].length; j++) {
            boolean isEqual = true;
            char ch = ' ';
            boolean fst = true;

            for (int k = 0; k <= strings.length - 1; k++) {

                if (fst) {
                    ch = strings[k][j];

                    fst = false;
                }

                System.out.println(ch + " " + strings[k][j]);
                if (ch != strings[k][j]) {
                    System.out.println("not equal");
                    isEqual = false;
                    break;
                }
                if (strings[k].length - 1 < j) {
                    isEqual = false;
                    System.out.println("break 1");
                    break;
                }
            }
            System.out.println();
            if (!isEqual) break;
            if (isEqual && ch != ' ') {
                res.append(ch);
            }
        }

        return res.toString();
    }

}
