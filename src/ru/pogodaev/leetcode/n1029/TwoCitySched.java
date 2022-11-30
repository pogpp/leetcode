package ru.pogodaev.leetcode.n1029;

import java.util.Arrays;
import java.util.Comparator;

/**
 * A company is planning to interview 2n people. Given the array costs where costs[i] = [aCosti, bCosti],
 * the cost of flying the ith person to city a is aCosti, and the cost of flying the ith person to city b is bCosti.
 * <p>
 * Return the minimum cost to fly every person to a city such that exactly n people arrive in each city.
 */
public class TwoCitySched {

    public static void main(String[] args) {
        int[][] costs = {
            {10, 20},
            {30, 200},
            {400, 50},
            {30, 20}
        };
    }


    public int twoCitySchedCost(int[][] costs) {
        //TODO rethink
        Arrays.sort(costs, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return (a[1] - a[0]) - (b[1] - b[0]);
            }
        });

        int cost = 0;
        for (int i = 0; i < costs.length / 2; i++) {
            cost += costs[i][1] + costs[costs.length-i-1][0];
        }
        return cost;
    }
}
