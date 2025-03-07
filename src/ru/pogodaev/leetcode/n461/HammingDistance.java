package ru.pogodaev.leetcode.n461;

public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        int counter = 0;
        StringBuilder xbin = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder ybin = new StringBuilder(Integer.toBinaryString(y));
        int xsize = xbin.length();
        int ysize = ybin.length();
        if (xsize > ysize) {
            for (int i = 0; i < xsize - ysize; i++) {
                ybin.insert(0, "0");
            }
        }
        if (ysize > xsize) {
            for (int i = 0; i < ysize - xsize; i++) {
                xbin.insert(0, "0");
            }
        }

        for (int i = 0; i < xbin.length(); i++) {
            if (xbin.charAt(i) != ybin.charAt(i)) {
                counter++;
            }
        }

        return counter;
    }
}
