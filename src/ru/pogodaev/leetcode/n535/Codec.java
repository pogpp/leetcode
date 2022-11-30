package ru.pogodaev.leetcode.n535;

public class Codec {

    private static final String allowedString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-";
    private char[] allowedCharacters = allowedString.toCharArray();
    private int base = allowedCharacters.length;


    public String encode(String longUrl) {

        var encodedString = new StringBuilder();
        String s = longUrl.substring(0, longUrl.lastIndexOf('/'));
        String k = longUrl.substring(longUrl.lastIndexOf('/') + 1);
        encodedString.append(s).append("/");

        for (char m : k.toCharArray()) {
            encodedString.append(allowedString.indexOf(m));
        }
        System.out.println(encodedString.toString());

        return encodedString.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String s = shortUrl.substring(0, shortUrl.lastIndexOf('/'));
        String k = shortUrl.substring(shortUrl.lastIndexOf('/') + 1);
        var decodedString = new StringBuilder();
        decodedString.append(s).append("/");
        System.out.println(k);

        for (char o : k.toCharArray()) {
            int index = Integer.parseInt(String.valueOf(o));
            decodedString.append(allowedString.charAt(index));
        }


        System.out.println(decodedString.toString());

        return decodedString.toString();
    }


}
