package ru.pogodaev.interviews;

/**
 * Given N items where each item has some weight and profit associated with it and also given a bag with capacity W,
 * [i.e., the bag can hold at most W weight in it].
 * The task is to put the items into the bag such that the sum of profits associated with them is the maximum possible.
 */
public class Knapsak {
    static int knapSack(int capacity, int[] wt, int[] val, int n) {
        // Base Case
        if (n == 0 || capacity == 0)
            return 0;

        // If weight of the nth item is
        // more than Knapsack capacity,
        // then this item cannot be included
        // in the optimal solution
        if (wt[n - 1] > capacity) {
            return knapSack(capacity, wt, val, n - 1);
        } else {
            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
            return Math.max(knapSack(capacity, wt, val, n - 1),
                    val[n - 1] + knapSack(capacity - wt[n - 1], wt, val, n - 1));
        }
    }
}
