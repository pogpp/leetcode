package ru.pogodaev.leetcode.n1170;

/**
 * Let the function f(s) be the frequency of the lexicographically smallest character in a non-empty string s.
 * For example, if s = "dcce" then f(s) = 2 because the lexicographically smallest character is 'c',
 * which has a frequency of 2.
 * <p>
 * You are given an array of strings words and another array of query strings queries. For each query queries[i],
 * count the number of words in words such that f(queries[i]) < f(W) for each W in words.
 * <p>
 * Return an integer array answer, where each answer[i] is the answer to the ith query.
 */

public class CompareStrings {

    public static void main(String[] args) {
//        int[] r = numSmallerByFrequency(new String[]{"cbd"}, new String[] {"zaaaz"});
//        int[] r = numSmallerByFrequency(new String[]{"bbb","cc"}, new String[] {"a","aa","aaa","aaaa"});
//        for (int t : r) {
//            System.out.println(t);
//        }
    }


    public int[] numSmallerByFrequency(String[] queries, String[] words) {

        int[] fCount = new int[11];

        for (String word : words) {
            int count = getFCount(word);
            fCount[count]++;
        }


        int sum = 0;
        for (int i = 0; i < fCount.length; i++) {
            sum += fCount[i];
            fCount[i] = sum;
        }

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int count = getFCount(queries[i]);
            res[i] = fCount[fCount.length - 1] - fCount[count];
        }

        return res;
    }

    public int getFCount(String word) {
        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }

        for (int value : count) {
            if (value != 0) {
                return value;
            }
        }

        return 0;
    }


}
