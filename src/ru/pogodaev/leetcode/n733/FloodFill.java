package ru.pogodaev.leetcode.n733;


/**
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
 * <p>
 * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor,
 * "flood fill" the image.
 * <p>
 * To perform a "flood fill", consider the starting pixel,
 * plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
 * plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on.
 * Replace the color of all of the aforementioned pixels with the newColor.
 * <p>
 * At the end, return the modified image.
 */
public class FloodFill {
    public int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    private void dfs(int[][] image, int x, int y, int newColor, int oldColor) {
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] == newColor) {
            return;
        }
        if (image[x][y] == oldColor) {
            image[x][y] = newColor;
            for (int[] dir : dirs) {
                dfs(image, x + dir[0], y + dir[1], newColor, oldColor);
            }
        }
    }
}
