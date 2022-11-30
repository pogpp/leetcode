package ru.pogodaev.leetcode.n771;

public class JewelsAndStones {
    public static void main(String[] args) {

    }

    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        for (char j : J.toCharArray()) {
            for (char i : S.toCharArray()) {
                if (j == i) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
