package ru.pogodaev.leetcode.n13;

/*
* Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*
* For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II.
*  The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
* However, the numeral for four is not IIII.
* Instead, the number four is written as IV.
*  Because the one is before the five we subtract it making four.
* The same principle applies to the number nine, which is written as IX.
*  There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 * */

public class RomainToInt {
    public static int romanToInt(String s) {
        int res = 0;

        var romans = s.toCharArray();

        for (int i = 0; i < romans.length; i++) {
            char roman = romans[i];
            if (roman == 'I') {
                if (i + 1 != romans.length) {
                    char next = romans[i + 1];
                    if (next == 'I') {
                        res = res + 1;
                    } else if (next == 'V') {
                        res = res + 4;
                        i++;
                    } else if (next == 'X') {
                        res = res + 9;
                        i++;
                    }
                } else {
                    res = res + 1;
                }
            } else if (roman == 'V') {
                res = res + 5;
            } else if (roman == 'X') {
                if (i + 1 != romans.length) {
                    char next = romans[i + 1];
                    if (next == 'L') {
                        res = res + 40;
                        i++;
                    } else if (next == 'C') {
                        res = res + 90;
                        i++;
                    } else {
                        res = res + 10;
                    }
                } else {
                    res = res + 10;
                }
            } else if (roman == 'L') {
                res = res + 50;
            } else if (roman == 'C') {
                if (i + 1 != romans.length) {
                    char next = romans[i + 1];
                    if (next == 'D') {
                        res = res + 400;
                        i++;
                    } else if (next == 'M') {
                        res = res + 900;
                        i++;
                    } else {
                        res = res + 100;
                    }
                } else {
                    res = res + 100;
                }
            } else if (roman == 'D') {
                res = res + 500;
            } else if (roman == 'M') {
                res = res + 1000;
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        System.out.println(romanToInt("IV"));
//        System.out.println(romanToInt("IX"));
//        System.out.println(romanToInt("I"));
//        System.out.println(romanToInt("II"));
//        System.out.println(romanToInt("III"));
//        System.out.println(romanToInt("VI"));
//        System.out.println(romanToInt("VII"));
//        System.out.println(romanToInt("VIII"));
//        System.out.println(romanToInt("XVIII"));
//        System.out.println(romanToInt("XIX"));
//        System.out.println(romanToInt("XX"));
//        System.out.println(romanToInt("XXI"));
//        System.out.println(romanToInt("XL"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
