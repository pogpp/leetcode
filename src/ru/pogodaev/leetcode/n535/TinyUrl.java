package ru.pogodaev.leetcode.n535;

public class TinyUrl {
    public static void main(String[] args) {
        Codec codec = new Codec();
//        codec.encode("https://leetcode.com/problems/design-tinyurl");
        codec.decode(codec.encode("https://leetcode.com/problems/design-tinyurl"));
    }
}
