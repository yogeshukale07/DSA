package com.yu.DSA.Logical;

public class Permutation {
    public static void main(String[] args) {
        String str = "123";
        generatePermutation("", str);
    }

    public static void generatePermutation(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        for (int i =0; i<remaining.length(); i++) {
            char ch = remaining.charAt(i);
            String newPrefix = prefix + ch;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i+1);
            generatePermutation(newPrefix, newRemaining);
        }
    }
}
