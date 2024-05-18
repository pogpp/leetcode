package ru.pogodaev.leetcode.n169;

import java.util.Arrays;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * Constraints:
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 */

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement2(int[] nums) {
        // Function to find majority element
        int count = 0, candidate = -1;

        // Finding majority candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else {
                if (num == candidate)
                    count++;
                else
                    count--;
            }
        }

        // Checking if majority candidate occurs more than
        // n/2 times
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > (nums.length / 2)) {
            return candidate;
        }
        return -1;

        // The last for loop and the if statement step can
        // be skip if a majority element is confirmed to
        // be present in an array just return candidate
        // in that case
    }
}

