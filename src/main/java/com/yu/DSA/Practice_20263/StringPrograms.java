package com.yu.DSA.Practice_20263;

import java.util.Arrays;

public class StringPrograms {
    public static void main(String[] args) {
        System.out.println("isAnagram : " + isAnagram("main", "naim"));

    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
