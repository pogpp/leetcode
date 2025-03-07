package ru.pogodaev.leetcode.n1108;

public class IPAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        String res = "";
        for (char c : address.toCharArray()) {
            if (c != '.') {
                res = res.concat(String.valueOf(c));
            } else {
                res = res.concat("[.]");
            }
        }
        return res;
    }


}
