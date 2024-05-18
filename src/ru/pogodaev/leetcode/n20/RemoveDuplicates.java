package ru.pogodaev.leetcode.n20;


import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice.
 * The relative order of the elements should be kept the same.
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums. More formally,
 * if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] num = new int[]{1, 1, 1, 2, 2, 3};
        int[] num2 = new int[]{-3, -1, 0, 0, 0, 3, 3};
        int[] num3 = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};

        removeDuplicates2(num3);
    }


    public static int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int res = 0;

        for (int num : nums) {
            int val = map.getOrDefault(num, 0);
            map.put(num, ++val);
        }

        int i = 0;
        for (int k : map.keySet()) {
            if (map.get(k) > 1) {
                nums[i++] = k;
                nums[i++] = k;
                res += 2;
            } else {
                nums[i++] = k;
                res++;
            }
        }

        for (int j = 0; j < res; j++) {
            System.out.println(nums[j]);
        }

        return res;
    }

    public static int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == 1) {
                nums[next++] = nums[i];
            } else {
                if (nums[i] != nums[next - 1] || nums[i] != nums[next - 2]) {
                    nums[next++] = nums[i];
                }
            }
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return next;
    }
}

