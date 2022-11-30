package ru.pogodaev.leetcode.n1189;

public class MaxBalloons {

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
    }

    public static int maxNumberOfBalloons(String text) {
        int bcounter = 0;
        int acounter = 0;
        int lcounter = 0;
        int ocounter = 0;
        int ncounter = 0;
        int counter = 0;
        char[] array = text.toCharArray();

        for (char c : array) {
            if (c == 'b') bcounter++;
            if (c == 'a') acounter++;
            if (c == 'l') lcounter++;
            if (c == 'o') ocounter++;
            if (c == 'n') ncounter++;
        }
        while (bcounter > 0 && acounter > 0 && lcounter > 0 && ocounter > 0 && ncounter > 0) {
            bcounter--;
            acounter--;
            lcounter--;
            lcounter--;
            ocounter--;
            ocounter--;
            ncounter--;
            if (bcounter >= 0 && acounter >= 0 && lcounter >= 0 && ocounter >= 0 && ncounter >= 0) {
                counter++;
            }
        }

        return counter;
    }
}
