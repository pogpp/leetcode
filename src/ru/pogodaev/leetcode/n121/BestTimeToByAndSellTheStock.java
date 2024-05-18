package ru.pogodaev.leetcode.n121;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * */


public class BestTimeToByAndSellTheStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for (int sell : prices) {
            if (sell > buy) {
                profit = Math.max(profit, sell - buy);
            } else {
                buy = sell;
            }
        }
        return profit;
    }
}
