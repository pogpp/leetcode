package ru.pogodaev.leetcode.n49;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together.
 */

public class GroupAnnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }

            groups.get(key).add(s);
        }

        return new ArrayList<>(groups.values());
    }
}
