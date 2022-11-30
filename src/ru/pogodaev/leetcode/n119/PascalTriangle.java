package ru.pogodaev.leetcode.n119;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */

public class PascalTriangle {

    public static void main(String[] args) {
        List<Integer> row = getRow(2);

        System.out.println("size " + row.size());

        for (int k : row) {
            System.out.println(k);
        }
    }


    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return List.of(1);
        List<Integer> result = getRow(rowIndex - 1);

        List<Integer> valuesAtN = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i <= rowIndex; i++) {
            if (i == 0 || i == rowIndex) {
                valuesAtN.add(1);
            } else {
                valuesAtN.add(result.get(i - 1) + result.get(i));
            }
        }

        return valuesAtN;
    }


}
