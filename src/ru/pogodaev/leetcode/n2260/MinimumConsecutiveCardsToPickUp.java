package ru.pogodaev.leetcode.n2260;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given an integer array cards where cards[i] represents the value of the ith card.
 * A pair of cards are matching if the cards have the same value.
 * <p>
 * Return the minimum number of consecutive cards you have to pick up to have a pair of matching cards among
 * the picked cards. If it is impossible to have matching cards, return -1.
 */

public class MinimumConsecutiveCardsToPickUp {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, List<Integer>> dic = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            int num = cards[i];
            if (!dic.containsKey(num)) {
                dic.put(num, new ArrayList<>());
            }

            dic.get(num).add(i);
        }

        int ans = Integer.MAX_VALUE;
        for (int key : dic.keySet()) {
            List<Integer> arr = dic.get(key);
            for (int i = 0; i < arr.size() - 1; i++) {
                ans = Math.min(ans, arr.get(i + 1) - arr.get(i) + 1);
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;
    }
}
