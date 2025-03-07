package ru.pogodaev.leetcode.n1051;

/**
 * Students are asked to stand in non-decreasing order of heights for an annual photo.
 * <p>
 * Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.
 * <p>
 * Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        int result = 0;
        int curHeight = 0;
        int[] heightToFreq = new int[101];

//        3, 1 , 0, 3


        for (int height : heights) {
            heightToFreq[height]++;
        }
//        0, 1, 0, 2hc


        for (int height : heights) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }

            if (curHeight != height) {
                result++;
            }
            heightToFreq[curHeight]--;
        }

        return result;
    }

}
