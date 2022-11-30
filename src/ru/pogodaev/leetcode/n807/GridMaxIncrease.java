package ru.pogodaev.leetcode.n807;

public class GridMaxIncrease {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };


        System.out.println(maxIncreaseKeepingSkyline(grid));

    }


    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int summ = 0;
        int[] xmax = new int[grid.length];
        int[] ymax = new int[grid[0].length];
        int s = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > s) {
                    s = grid[i][j];
                }
            }
            ymax[i] = s;
            s = 0;
        }

        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > s) {
                    s = grid[j][i];
                }
            }
            xmax[i] = s;
            s = 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int min = Math.min(ymax[i], xmax[j]);
                summ += min - grid[i][j];
            }
        }

        return summ;
    }
}
