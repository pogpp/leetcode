package ru.pogodaev.leetcode.n824;

public class GoatLatin {

    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        System.out.println(toGoatLatin(s));
    }

    public static String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        int k = 1;
        String[] array = S.split(" ");
        for (String s : array) {
            char f = s.charAt(0);

            if (f == 'a' || f == 'o' || f == 'e' || f == 'i' || f == 'u' || f == 'A' || f == 'O' || f == 'E' || f == 'I' || f == 'U') {
                sb.append(s).append("ma");
            } else {
                sb.append(s.substring(1)).append(f).append("ma");
            }
            for (int i = 0; i < k; i++) {
                sb.append("a");
            }
            k++;
            if (array.length != k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
