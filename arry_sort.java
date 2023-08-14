package com.company;


import java.util.Arrays;

public class arry_sort {
    public static void main(String[] args) {
        int[] arr = { 10,56,3,7};
        int n = arr.length;
         Arrays.sort(arr);
        System.out.println(arr[n-2]);
    }
}
