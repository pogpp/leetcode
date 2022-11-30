package ru.pogodaev.leetcode.n506;

import java.util.Arrays;

/**
 * You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
 * <p>
 * The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
 * <p>
 * The 1st place athlete's rank is "Gold Medal".
 * The 2nd place athlete's rank is "Silver Medal".
 * The 3rd place athlete's rank is "Bronze Medal".
 * For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
 * Return an array answer of size n where answer[i] is the rank of the ith athlete.
 */

public class RelativeRanks {

    public static void main(String[] args) {
        findRelativeRanks(new int[]{5, 4, 3, 2, 1});
        findRelativeRanks(new int[]{10, 3, 8, 9, 4});
    }

    public static String[] findRelativeRanks(int[] score) {
        String[] res = new String[score.length];
        int[] buff = score.clone();
        Arrays.sort(buff);

        for (int j = 0; j < score.length; j++) {

            for (int i = buff.length - 1; i >= 0; i--) {
                if (score[j] == buff[i]) {
                    if (buff.length - 1 - i == 0) {
                        res[j] = "Gold Medal";
                    } else if (buff.length - 1 - i == 1) {
                        res[j] = "Silver Medal";
                    } else if (buff.length - 1 - i == 2) {
                        res[j] = "Bronze Medal";
                    } else {
                        res[j] = String.valueOf(buff.length - 1 - i + 1);
                    }
                }
            }
        }

        return res;
    }
}
