package ru.pogodaev.leetcode.n1313;

public class DecompressRLE {

    public static void main(String[] args) {
        for (int n : decompressRLElist(new int[]{1, 2, 3, 4})) {
            System.out.println(n);
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            length = length + nums[i];
        }
        int[] res = new int[length];
        int k = 0;

        for (int i = 1; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                res[k] = nums[i];
                k++;
            }
        }
        return res;
    }

}
