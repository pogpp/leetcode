package ru.pogodaev.leetcode.n1281;

public class ProductAndSum {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int k;

        while (n > 0) {
            k = n % 10;
            sum += k;
            product *= k;
            n = n / 10;
        }

        return product - sum;
    }
}
