package ru.pogodaev.leetcode.n2342;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of integers nums, find the maximum value of nums[i] + nums[j], where nums[i] and nums[j]
 * have the same digit sum (the sum of their individual digits).
 * Return -1 if there is no pair of numbers with the same digit sum.
 */
public class MaxSumOfAPairWithEqualSumOfDigits {

    public static void main(String[] args) {
        var input = new int[]{18, 43, 36, 13, 7};
        //9, 7, 9, 4, 7
        System.out.println(maximumSum(input));
    }


    public static int maximumSum(int[] nums) {
        var result = -1;
        var map = new HashMap<Integer, List<Integer>>();

        for (int num : nums) {
            var sum = sumDigits(num);
            if (!map.containsKey(sum)) {
                map.put(sum, new ArrayList<>() {
                });
            }

            map.get(sum).add(num);
        }

        for (var val : map.values()) {
            if (val.size() < 2) {
                continue;
            }
            System.out.println(maxSum(val));
            result = Math.max(result, maxSum(val));
            System.out.println("result " + result);
        }

        return result;
    }

    static int sumDigits(int no) {
        return no == 0 ? 0 : no % 10 +
                sumDigits(no / 10);
    }

    static int maxSum(List<Integer> list) {
        Collections.sort(list);

        return list.get(0) + list.get(1);
    }
}
