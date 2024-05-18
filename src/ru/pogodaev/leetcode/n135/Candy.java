package ru.pogodaev.leetcode.n135;

/**
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * <p>
 * You are giving candies to these children subjected to the following requirements:
 * <p>
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 */

public class Candy {
    public static void main(String[] args) {
        int[] example = new int[]{5, 4, 3, 5, 6, 2};
        int[] example2 = new int[]{1, 0, 2};
        int[] example3 = new int[]{1, 2, 2};
        System.out.println(candy(example));
        System.out.println(candy(example2));
        System.out.println(candy(example3));
    }

    public static int candy(int[] ratings) {
        int len = ratings.length;
        int candies = 0;
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = 1;
        }

        for (int i = 1; i < len; i++) {
            if (ratings[i - 1] < ratings[i]) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                arr[i] = Math.max(arr[i], arr[i + 1] + 1);
            }
        }

        for (int i = 0; i < len; i++) {
            candies += arr[i];
        }

        return candies;
    }
}
