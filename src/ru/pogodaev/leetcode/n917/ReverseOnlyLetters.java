package ru.pogodaev.leetcode.n917;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("7_28]"));

    }

    public static String reverseOnlyLetters(String S) {

        char[] arr = S.toCharArray();
        int i = 0;
        int k = arr.length - 1;
        while (i < k) {
            char left = arr[i];
            char right = arr[k];
            if (!Character.isLetter(left)) {
                do {
                    i++;
                    left = arr[i];
                } while (!Character.isLetter(left) && i < k);
            }
            if (!Character.isLetter(right)) {
                do {
                    k--;
                    right = arr[k];
                } while (!Character.isLetter(right) && i < k);
            }

            if (Character.isLetter(right) && Character.isLetter(left) && i < k) {
                arr[i] = right;
                arr[k] = left;
            }


            i++;
            k--;
        }
        return String.copyValueOf(arr);
    }
}
