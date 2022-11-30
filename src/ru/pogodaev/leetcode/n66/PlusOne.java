package ru.pogodaev.leetcode.n66;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contains a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */
public class PlusOne {
    public static void main(String[] args) {
        plusOne(new int[]{4, 3, 2, 1});
        plusOne(new int[]{1, 2, 3});
        plusOne(new int[]{9, 9, 9});
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> sum = new ArrayList<>();
        int j = 0;
        int arm = 0;

        for (int i = digits.length - 1; i >= 0; i--) {

            int k = 0;
            if (i == digits.length - 1) {
                k = digits[i] + 1;
            } else {
                k = digits[i];
            }

            if (k > 9 || k + arm > 9) {
                sum.add(j++, k + arm - 10);
                arm = 1;
            } else {
                sum.add(j++, k + arm);
                arm = 0;
            }

            if (i == 0 && arm == 1) {
                sum.add(j++, 1);
            }

        }


        int[] res = new int[sum.size()];
        int k = 0;
        for (int i = sum.size() - 1; i >= 0; i--) {
            res[k++] = sum.get(i);
        }

        return res;
    }


    public int[] plusOnes(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }

}
