package ru.pogodaev.leetcode.n26;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int k : nums) {
            set.add(k);
        }
        int i = 0;
        for (int k : set) {
            nums[i] = k;
            i++;
        }
        return set.size();
    }

    public int removeDuplicatess(int[] nums) {
        int length = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[length]) {
                nums[++length] = nums[i];
            }
        }
        return length + 1;
    }
}
