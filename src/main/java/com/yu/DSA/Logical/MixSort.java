package com.yu.DSA.Logical;

import java.util.Arrays;

public class MixSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 6};
        System.out.println("MixSort : " + Arrays.toString(getMixSort(arr)));
    }
    public static int[] getMixSort(int[] arr) {
        Arrays.sort(arr);

        int length = arr.length;
        int left = 0;
        int right = length-1;
        int k = 0;

        int[] resultArr = new int[arr.length];

        while (left <= right) {
            resultArr[k++] = arr[right--];
            if (k<length)resultArr[k++] = arr[left++];
        }

        return resultArr;
    }
}
