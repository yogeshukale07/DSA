package com.yu.DSA.Logical;

public class PolindromByAllowing1Issue {
    public static void main(String[] args) {
        String str = "abbaa";//Output: tru, bcz we need to allow at least 1 mistake

        System.out.println("Given String is Polindrom : " + polindrom(str));
    }

    public static boolean polindrom(String str) {
        int left = 0;
        int right = str.length()-1;
        while (left < right)  {
            if (str.charAt(left) != str.charAt(right)) {
                return polindromHelper(str, left+1, right) || polindromHelper(str, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean polindromHelper(String str, int left, int right) {
        while (left < right)  {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
